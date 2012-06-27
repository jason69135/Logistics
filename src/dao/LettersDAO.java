package dao;

import java.util.List;
import beans.Letters;

/**
 * A data access object (DAO) providing persistence and search support for
 * Letters entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Letters
 * @author MyEclipse Persistence Tools
 */

public interface LettersDAO {

	public void save(Letters transientInstance);

	public void delete(Letters persistentInstance);

	public Letters findById(java.lang.Integer id);

	public List<Letters> findByProperty(String propertyName, Object value);

	public List<Letters> findAll();

}