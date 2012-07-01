package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Number;

/**
 * A data access object (DAO) providing persistence and search support for
 * Number entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Number
 * @author MyEclipse Persistence Tools
 */

public class NumberDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(NumberDAO.class);
	// property constants
	public static final String ROUTEID = "routeid";
	public static final String SIZE = "size";

	protected void initDao() {
		// do nothing
	}

	public void save(Number transientInstance) {
		log.debug("saving Number instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Number persistentInstance) {
		log.debug("deleting Number instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Number findById(java.lang.Integer id) {
		log.debug("getting Number instance with id: " + id);
		try {
			Number instance = (Number) getHibernateTemplate().get(
					"haha.Number", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Number instance) {
		log.debug("finding Number instance by example");
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
		log.debug("finding Number instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Number as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByRouteid(Object routeid) {
		return findByProperty(ROUTEID, routeid);
	}

	public List findBySize(Object size) {
		return findByProperty(SIZE, size);
	}

	public List findAll() {
		log.debug("finding all Number instances");
		try {
			String queryString = "from Number";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Number merge(Number detachedInstance) {
		log.debug("merging Number instance");
		try {
			Number result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Number instance) {
		log.debug("attaching dirty Number instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Number instance) {
		log.debug("attaching clean Number instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static NumberDAO getFromApplicationContext(ApplicationContext ctx) {
		return (NumberDAO) ctx.getBean("NumberDAO");
	}
}