package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Siteadmin;

/**
 * A data access object (DAO) providing persistence and search support for
 * Siteadmin entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Siteadmin
 * @author MyEclipse Persistence Tools
 */

public class SiteadminDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SiteadminDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String SITEID = "siteid";
	public static final String RIGHT = "right";

	protected void initDao() {
		// do nothing
	}

	public void save(Siteadmin transientInstance) {
		log.debug("saving Siteadmin instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Siteadmin persistentInstance) {
		log.debug("deleting Siteadmin instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Siteadmin findById(java.lang.Integer id) {
		log.debug("getting Siteadmin instance with id: " + id);
		try {
			Siteadmin instance = (Siteadmin) getHibernateTemplate().get(
					"haha.Siteadmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Siteadmin instance) {
		log.debug("finding Siteadmin instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Siteadmin instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Siteadmin as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsername(Object username) {
		return findByProperty(USERNAME, username);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findBySiteid(Object siteid) {
		return findByProperty(SITEID, siteid);
	}

	public List findByRight(Object right) {
		return findByProperty(RIGHT, right);
	}

	public List findAll() {
		log.debug("finding all Siteadmin instances");
		try {
			String queryString = "from Siteadmin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Siteadmin merge(Siteadmin detachedInstance) {
		log.debug("merging Siteadmin instance");
		try {
			Siteadmin result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Siteadmin instance) {
		log.debug("attaching dirty Siteadmin instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Siteadmin instance) {
		log.debug("attaching clean Siteadmin instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SiteadminDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SiteadminDAO) ctx.getBean("SiteadminDAO");
	}
}