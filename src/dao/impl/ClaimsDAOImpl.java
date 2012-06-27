package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import beans.Claims;
import dao.ClaimsDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Claims entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Claims
 * @author MyEclipse Persistence Tools
 */

public class ClaimsDAOImpl extends HibernateDaoSupport implements ClaimsDAO {
	private static final Log log = LogFactory.getLog(ClaimsDAOImpl.class);

	public void delete(Claims persistentInstance) {
		log.debug("deleting Claims instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Claims findById(java.lang.Integer id) {
		log.debug("getting Claims instance with id: " + id);
		try {
			Claims instance = (Claims) getSession().get("daoNew.Claims", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Claims> findByProperty(String propertyName, Object value) {
		log.debug("finding Claims instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Claims as model where model."
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
	public List<Claims> findAll() {
		log.debug("finding all Claims instances");
		try {
			String queryString = "from Claims";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	@Override
	public void save(Claims transientInstance) {
		log.debug("saving Claims instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}
}