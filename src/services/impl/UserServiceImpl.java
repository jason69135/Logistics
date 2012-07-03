package services.impl;

import java.util.List;

import beans.Customer;
import dao.CustomerDAO;

public class UserServiceImpl implements services.UserService {
	private CustomerDAO customerDao;

	public CustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}

	public boolean userLogin(String username, String password) {
		List<Customer> list = this.customerDao.findByName(username);
		if (list.size() != 0) {// 先判断用户存在
			if (password.equals(list.get(0).getPassword())) {
				return true;
			}
		}
		return false;
	}

	public Customer ShowPersonset(String username) {
		return this.customerDao.findByName(username).get(0);
	}

	public boolean changePassword(Customer customer, String newPassword) {
		List<Customer> list = customerDao.findByName(customer.getUsername());
		Customer existCustomer = list.get(0);
		existCustomer.setPassword(newPassword);
		customerDao.update(existCustomer);
		return true;
	}

	public boolean changeEmail(Customer customer, String newEmail) {
		List<Customer> list = customerDao.findByName(customer.getUsername());
		Customer existCustomer = list.get(0);
		existCustomer.setEmail(newEmail);
		customerDao.update(existCustomer);
		return true;
	}

	public Customer searchUser(String customername) {
		return this.customerDao.findByName(customername).get(0);
	}

	public void userRegister(Customer customer) {
		customerDao.save(customer);
	}
}
