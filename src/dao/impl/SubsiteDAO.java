package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Subsite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subsite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Subsite
 * @author MyEclipse Persistence Tools
 */

public class SubsiteDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SubsiteDAO.class);
	// property constants
	public static final String SITENAME = "sitename";
	public static final String FEE = "fee";
	public static final String SITEID = "siteid";

	protected void initDao() {
		// do nothing
	}

	public void save(Subsite transientInstance) {
		log.debug("saving Subsite instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subsite persistentInstance) {
		log.debug("deleting Subsite instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subsite findById(java.lang.Integer id) {
		log.debug("getting Subsite instance with id: " + id);
		try {
			Subsite instance = (Subsite) getHibernateTemplate().get(
					"haha.Subsite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Subsite instance) {
		log.debug("finding Subsite instance by example");
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
		log.debug("finding Subsite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subsite as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySitename(Object sitename) {
		return findByProperty(SITENAME, sitename);
	}

	public List findByFee(Object fee) {
		return findByProperty(FEE, fee);
	}

	public List findBySiteid(Object siteid) {
		return findByProperty(SITEID, siteid);
	}

	public List findAll() {
		log.debug("finding all Subsite instances");
		try {
			String queryString = "from Subsite";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Subsite merge(Subsite detachedInstance) {
		log.debug("merging Subsite instance");
		try {
			Subsite result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Subsite instance) {
		log.debug("attaching dirty Subsite instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subsite instance) {
		log.debug("attaching clean Subsite instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SubsiteDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SubsiteDAO) ctx.getBean("SubsiteDAO");
	}
}