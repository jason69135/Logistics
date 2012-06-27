package dao;

import java.util.List;
import beans.Deliveryadmin;

/**
 * A data access object (DAO) providing persistence and search support for
 * Deliveryadmin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see daoNew.Deliveryadmin
 * @author MyEclipse Persistence Tools
 */

public interface DeliveryadminDAO {
	public void save(Deliveryadmin transientInstance);

	public void delete(Deliveryadmin persistentInstance);

	public Deliveryadmin findById(java.lang.Integer id);

	public List<Deliveryadmin> findByProperty(String propertyName, Object value);

	public List<Deliveryadmin> findAll();

}