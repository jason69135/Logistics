package dao;

import java.util.List;

import beans.Subnumber;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subnumber entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Subnumber
 * @author MyEclipse Persistence Tools
 */

public interface SubnumberDAO {

	public void save(Subnumber transientInstance);

	public void delete(Subnumber persistentInstance);

	public Subnumber findById(java.lang.Integer id);

	public List<Subnumber> findByProperty(String propertyName, Object value);

	public List<Subnumber> findAll();
}