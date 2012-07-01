package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Waitlist;

/**
 * A data access object (DAO) providing persistence and search support for
 * Waitlist entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Waitlist
 * @author MyEclipse Persistence Tools
 */

public class WaitlistDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(WaitlistDAO.class);
	// property constants
	public static final String ORDERID = "orderid";
	public static final String NUMBERID = "numberid";
	public static final String SITEID = "siteid";

	protected void initDao() {
		// do nothing
	}

	public void save(Waitlist transientInstance) {
		log.debug("saving Waitlist instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Waitlist persistentInstance) {
		log.debug("deleting Waitlist instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Waitlist findById(java.lang.Integer id) {
		log.debug("getting Waitlist instance with id: " + id);
		try {
			Waitlist instance = (Waitlist) getHibernateTemplate().get(
					"haha.Waitlist", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Waitlist instance) {
		log.debug("finding Waitlist instance by example");
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
		log.debug("finding Waitlist instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Waitlist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderid(Object orderid) {
		return findByProperty(ORDERID, orderid);
	}

	public List findByNumberid(Object numberid) {
		return findByProperty(NUMBERID, numberid);
	}

	public List findBySiteid(Object siteid) {
		return findByProperty(SITEID, siteid);
	}

	public List findAll() {
		log.debug("finding all Waitlist instances");
		try {
			String queryString = "from Waitlist";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Waitlist merge(Waitlist detachedInstance) {
		log.debug("merging Waitlist instance");
		try {
			Waitlist result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Waitlist instance) {
		log.debug("attaching dirty Waitlist instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Waitlist instance) {
		log.debug("attaching clean Waitlist instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static WaitlistDAO getFromApplicationContext(ApplicationContext ctx) {
		return (WaitlistDAO) ctx.getBean("WaitlistDAO");
	}
}