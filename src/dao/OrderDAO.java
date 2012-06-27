package dao;

import java.util.List;

import javax.persistence.criteria.Order;

/**
 * A data access object (DAO) providing persistence and search support for Order
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see daoNew.Order
 * @author MyEclipse Persistence Tools
 */

public interface OrderDAO {

	public void save(Order transientInstance);

	public void delete(Order persistentInstance);

	public Order findById(java.lang.Integer id);

	public List<Order> findByProperty(String propertyName, Object value);

	public List<Order> findAll();

}