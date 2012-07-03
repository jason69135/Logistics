package dao;

import java.util.List;

import beans.Customer;

public interface CustomerDAO {

	public void save(Customer transientInstance);

	public void delete(Customer persistentInstance);

	public List<Customer> findByName(String username);
	
	public void update(Customer persistentInstance);

}