package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Site;

import dao.SiteDAO;

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

public class SiteDAOImpl extends HibernateDaoSupport implements SiteDAO {
	private static final Log log = LogFactory.getLog(ReceiverDAOImpl.class);

	public void save(Site transientInstance) {
		log.debug("saving Site instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Site persistentInstance) {
		log.debug("deleting Site instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Site findById(java.lang.Integer id) {
		log.debug("getting Site instance with id: " + id);
		try {
			Site instance = (Site) getSession().get("daoNew.Site", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Site> findByProperty(String propertyName, Object value) {
		log.debug("finding Site instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Site as model where model."
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
	public List<Site> findAll() {
		log.debug("finding all Site instances");
		try {
			String queryString = "from Site";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

}