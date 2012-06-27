package dao;

import java.util.List;

import beans.Site;

/**
 * A data access object (DAO) providing persistence and search support for Site
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see daoNew.Site
 * @author MyEclipse Persistence Tools
 */

public interface SiteDAO {

	public void save(Site transientInstance);

	public void delete(Site persistentInstance);

	public Site findById(java.lang.Integer id);

	public List<Site> findByProperty(String propertyName, Object value);

	public List<Site> findAll();

}