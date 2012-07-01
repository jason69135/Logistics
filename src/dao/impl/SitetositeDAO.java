package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Sitetosite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Sitetosite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see beans.Sitetosite
 * @author MyEclipse Persistence Tools
 */

public class SitetositeDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(SitetositeDAO.class);
	// property constants
	public static final String SITEA = "sitea";
	public static final String SITEB = "siteb";
	public static final String FEE = "fee";

	protected void initDao() {
		// do nothing
	}

	public void save(Sitetosite transientInstance) {
		log.debug("saving Sitetosite instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Sitetosite persistentInstance) {
		log.debug("deleting Sitetosite instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Sitetosite findById(java.lang.Integer id) {
		log.debug("getting Sitetosite instance with id: " + id);
		try {
			Sitetosite instance = (Sitetosite) getHibernateTemplate().get(
					"haha.Sitetosite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Sitetosite instance) {
		log.debug("finding Sitetosite instance by example");
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
		log.debug("finding Sitetosite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Sitetosite as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findBySitea(Object sitea) {
		return findByProperty(SITEA, sitea);
	}

	public List findBySiteb(Object siteb) {
		return findByProperty(SITEB, siteb);
	}

	public List findByFee(Object fee) {
		return findByProperty(FEE, fee);
	}

	public List findAll() {
		log.debug("finding all Sitetosite instances");
		try {
			String queryString = "from Sitetosite";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Sitetosite merge(Sitetosite detachedInstance) {
		log.debug("merging Sitetosite instance");
		try {
			Sitetosite result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Sitetosite instance) {
		log.debug("attaching dirty Sitetosite instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Sitetosite instance) {
		log.debug("attaching clean Sitetosite instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static SitetositeDAO getFromApplicationContext(ApplicationContext ctx) {
		return (SitetositeDAO) ctx.getBean("SitetositeDAO");
	}
}