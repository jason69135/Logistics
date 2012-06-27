package dao;

import java.util.List;

import beans.Customer;

public interface CustomerDAO {
	public void save(Customer transientInstance);

	public void delete(Customer persistentInstance);

	public Customer findById(java.lang.Integer id);

	public List<Customer> findByProperty(String propertyName, Object value);

	public List<Customer> findAll();
}
