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
		List<Customer> list = this.customerDao.find(username);
		if (list.size() != 0) {
			if (password.equals(list.get(0).getPassword()))
				return true;
		}
		return false;
	}

	public void userRegister(Customer customer) {
		customerDao.save(customer);
	}

	public boolean changePassword(Customer customer, String newPassword) {
		List<Customer> list = customerDao.find(customer.getUsername());
		Customer existCustomer = list.get(0);
		if (customer.getPassword().equals(existCustomer.getPassword())) {
			existCustomer.setPassword(newPassword);
			customerDao.update(existCustomer);
			return true;
		}
		return false;
	}
}
