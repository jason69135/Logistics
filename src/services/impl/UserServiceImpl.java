package services.impl;

import java.util.List;

import com.opensymphony.xwork2.ActionContext;

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
			if (password.equals(list.get(0).getPassword())) {
				ActionContext.getContext().getSession()
						.put("email", list.get(0).getEmail());
				ActionContext.getContext().getSession()
						.put("username", list.get(0).getUsername());
				return true;
			}
		}
		return false;
	}

	public void userRegister(Customer customer) {
		customerDao.save(customer);
	}

	public boolean changePassword(Customer customer, String newPassword) {
		List<Customer> list = customerDao.find(customer.getUsername());
		Customer existCustomer = list.get(0);
		if (existCustomer.getPassword().equals(customer.getPassword())) {
			existCustomer.setPassword(newPassword);
			customerDao.update(existCustomer);
			return true;
		}
		return false;
	}

	public boolean changeEmail(Customer customer, String newEmail) {
		List<Customer> list = customerDao.find(customer.getUsername());
		Customer existCustomer = list.get(0);
		existCustomer.setEmail(newEmail);
		customerDao.update(existCustomer);
		return true;
	}

	public Customer searchUser(Customer customer) {
		List<Customer> list = customerDao.find(customer.getUsername());
		Customer existCustomer = list.get(0);
		return existCustomer;
	}
}
