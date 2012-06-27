package services.impl;

import beans.Customer;
import dao.CustomerDAO;
import services.CustomerServices;

public class CustomerServiceImpl implements CustomerServices {
	private CustomerDAO customerDAO;

	public CustomerDAO getCustomerDAO() {
		return customerDAO;
	}

	public void setCustomerDAO(CustomerDAO customerDAO) {
		this.customerDAO = customerDAO;
	}

	@Override
	public boolean login(Customer customer) {
		Customer cus = this.customerDAO.findCustomer(customer.getUsername());
		if (cus.getPassword().equals(customer.getPassword()))
			return true;
		else
			return false;
	}

	@Override
	public void register(Customer customer) {
		this.customerDAO.insertCustomer(customer);
	}

}
