package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.SubsiteDAO;
import beans.Subsite;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subsite entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Subsite
 * @author MyEclipse Persistence Tools
 */

public class SubsiteDAOImpl extends HibernateDaoSupport implements SubsiteDAO {
	private static final Log log = LogFactory.getLog(SubsiteDAOImpl.class);

	public void save(Subsite transientInstance) {
		log.debug("saving Subsite instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subsite persistentInstance) {
		log.debug("deleting Subsite instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subsite findById(java.lang.Integer id) {
		log.debug("getting Subsite instance with id: " + id);
		try {
			Subsite instance = (Subsite) getSession().get("daoNew.Subsite", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Subsite> findByProperty(String propertyName, Object value) {
		log.debug("finding Subsite instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subsite as model where model."
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
	public List<Subsite> findAll() {
		log.debug("finding all Subsite instances");
		try {
			String queryString = "from Subsite";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}