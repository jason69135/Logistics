package dao;

import java.util.List;

import beans.Subsite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subsite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Subsite
 * @author MyEclipse Persistence Tools
 */

public interface SubsiteDAO {

	public void save(Subsite transientInstance);

	public void delete(Subsite persistentInstance);

	public Subsite findById(java.lang.Integer id);

	public List<Subsite> findByProperty(String propertyName, Object value);

	public List<Subsite> findAll();
}