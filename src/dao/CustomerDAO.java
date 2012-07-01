package dao;

import java.util.List;

import beans.Customer;

public interface CustomerDAO {

	public void save(Customer transientInstance);

	public void delete(Customer persistentInstance);
	
	public void update(Customer persistentInstance);

	public List<Customer> find(String username);

	public List<Customer> findByProperty(String value, String property);

}