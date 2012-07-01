package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Receiver;

/**
 * A data access object (DAO) providing persistence and search support for
 * Receiver entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Receiver
 * @author MyEclipse Persistence Tools
 */

public class ReceiverDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ReceiverDAO.class);
	// property constants
	public static final String USERNAME = "username";
	public static final String TEL = "tel";
	public static final String SUBSITEID = "subsiteid";
	public static final String CUSID = "cusid";

	protected void initDao() {
		// do nothing
	}

	public void save(Receiver transientInstance) {
		log.debug("saving Receiver instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Receiver persistentInstance) {
		log.debug("deleting Receiver instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Receiver findById(java.lang.Integer id) {
		log.debug("getting Receiver instance with id: " + id);
		try {
			Receiver instance = (Receiver) getHibernateTemplate().get(
					"haha.Receiver", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Receiver instance) {
		log.debug("finding Receiver instance by example");
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
		log.debug("finding Receiver instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Receiver as model where model."
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

	public List findByTel(Object tel) {
		return findByProperty(TEL, tel);
	}

	public List findBySubsiteid(Object subsiteid) {
		return findByProperty(SUBSITEID, subsiteid);
	}

	public List findByCusid(Object cusid) {
		return findByProperty(CUSID, cusid);
	}

	public List findAll() {
		log.debug("finding all Receiver instances");
		try {
			String queryString = "from Receiver";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Receiver merge(Receiver detachedInstance) {
		log.debug("merging Receiver instance");
		try {
			Receiver result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Receiver instance) {
		log.debug("attaching dirty Receiver instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Receiver instance) {
		log.debug("attaching clean Receiver instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ReceiverDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ReceiverDAO) ctx.getBean("ReceiverDAO");
	}
}