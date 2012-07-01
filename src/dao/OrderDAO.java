package dao;
import java.util.List;

import beans.Order;


public interface OrderDAO{
	
	public void save(Order transientInstance);

	public void delete(Order persistentInstance);

	public List<Order> findAll();

}