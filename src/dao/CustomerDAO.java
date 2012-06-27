package dao;

import beans.Customer;

public interface CustomerDAO {
	public Customer findCustomer(String username);

	public void insertCustomer(Customer customer);
}
