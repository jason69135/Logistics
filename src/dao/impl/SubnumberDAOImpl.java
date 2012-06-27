package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Subnumber;

import dao.SubnumberDAO;

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

public class SubnumberDAOImpl extends HibernateDaoSupport implements
		SubnumberDAO {
	private static final Log log = LogFactory.getLog(SubnumberDAOImpl.class);

	public void save(Subnumber transientInstance) {
		log.debug("saving Subnumber instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subnumber persistentInstance) {
		log.debug("deleting Subnumber instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subnumber findById(java.lang.Integer id) {
		log.debug("getting Subnumber instance with id: " + id);
		try {
			Subnumber instance = (Subnumber) getSession().get(
					"daoNew.Subnumber", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Subnumber> findByProperty(String propertyName, Object value) {
		log.debug("finding Subnumber instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subnumber as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Subnumber> findAll() {
		log.debug("finding all Subnumber instances");
		try {
			String queryString = "from Subnumber";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}