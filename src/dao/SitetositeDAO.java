package dao;

import java.util.List;

import beans.Sitetosite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Sitetosite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Sitetosite
 * @author MyEclipse Persistence Tools
 */

public interface SitetositeDAO {

	public void save(Sitetosite transientInstance);

	public void delete(Sitetosite persistentInstance);

	public Sitetosite findById(java.lang.Integer id);

	public List<Sitetosite> findByProperty(String propertyName, Object value);

	public List<Sitetosite> findAll();

}