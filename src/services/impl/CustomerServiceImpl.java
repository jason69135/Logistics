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
		if (this.customerDAO.findByProperty("username", customer.getUsername())
				.size() > 0)
			return true;
		else
			return false;
	}

	@Override
	public void register(Customer customer) {
		this.customerDAO.save(customer);
	}

}
