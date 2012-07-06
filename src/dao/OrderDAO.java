package dao;

import java.util.List;

import beans.Order;

public interface OrderDAO {

	public void save(Order transientInstance);
	
	public void update(Order transientInstance);

	public void delete(Order persistentInstance);

	public List<Order> findBycusid(int cusid);

	public Order findByid(int id);

	public Order findByorderno(String orderno);
	
	public List<Order> findByall();
	
	public List<Order> findByrouteid(int routeid);

}