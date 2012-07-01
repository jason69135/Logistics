package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Subsiteadmin;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subsiteadmin entities. Transaction control of the save(), update() and
 * delete() operations can directly support Spring container-managed
 * transactions or they can be augmented to handle user-managed Spring
 * transactions. Each of these methods provides additional information for how
 * to configure it for the desired type of transaction control.
 * 
 * @see beans.Subsiteadmin
 * @author MyEclipse Persistence Tools
 */

public class SubsiteadminDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SubsiteadminDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String SUBSITEID = "subsiteid";
	public static final String RIGHT = "right";

	protected void initDao() {
		// do nothing
	}

	public void save(Subsiteadmin transientInstance) {
		log.debug("saving Subsiteadmin instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subsiteadmin persistentInstance) {
		log.debug("deleting Subsiteadmin instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subsiteadmin findById(java.lang.Integer id) {
		log.debug("getting Subsiteadmin instance with id: " + id);
		try {
			Subsiteadmin instance = (Subsiteadmin) getHibernateTemplate().get(
					"haha.Subsiteadmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Subsiteadmin instance) {
		log.debug("finding Subsiteadmin instance by example");
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
		log.debug("finding Subsiteadmin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Subsiteadmin as model where model."
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

	public List findBySubsiteid(Object subsiteid) {
		return findByProperty(SUBSITEID, subsiteid);
	}

	public List findByRight(Object right) {
		return findByProperty(RIGHT, right);
	}

	public List findAll() {
		log.debug("finding all Subsiteadmin instances");
		try {
			String queryString = "from Subsiteadmin";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Subsiteadmin merge(Subsiteadmin detachedInstance) {
		log.debug("merging Subsiteadmin instance");
		try {
			Subsiteadmin result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Subsiteadmin instance) {
		log.debug("attaching dirty Subsiteadmin instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subsiteadmin instance) {
		log.debug("attaching clean Subsiteadmin instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SubsiteadminDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (SubsiteadminDAO) ctx.getBean("SubsiteadminDAO");
	}
}