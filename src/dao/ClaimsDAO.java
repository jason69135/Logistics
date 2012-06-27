package dao;

import java.util.List;
import beans.Claims;

/**
 * A data access object (DAO) providing persistence and search support for
 * Claims entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Claims
 * @author MyEclipse Persistence Tools
 */

public interface ClaimsDAO {

	public void save(Claims transientInstance);

	public void delete(Claims persistentInstance);

	public Claims findById(java.lang.Integer id);

	public List<Claims> findByProperty(String propertyName, Object value);

	public List<Claims> findAll();

}