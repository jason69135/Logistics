package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Sitetosite;

import dao.SitetositeDAO;

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

public class SitetositeDAOImpl extends HibernateDaoSupport implements
		SitetositeDAO {
	private static final Log log = LogFactory.getLog(SitetositeDAOImpl.class);

	public void save(Sitetosite transientInstance) {
		log.debug("saving Sitetosite instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sitetosite persistentInstance) {
		log.debug("deleting Sitetosite instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sitetosite findById(java.lang.Integer id) {
		log.debug("getting Sitetosite instance with id: " + id);
		try {
			Sitetosite instance = (Sitetosite) getSession().get(
					"daoNew.Sitetosite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Sitetosite> findByProperty(String propertyName, Object value) {
		log.debug("finding Sitetosite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sitetosite as model where model."
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
	public List<Sitetosite> findAll() {
		log.debug("finding all Sitetosite instances");
		try {
			String queryString = "from Sitetosite";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}