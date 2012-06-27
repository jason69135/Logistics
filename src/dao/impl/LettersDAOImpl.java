package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import beans.Letters;
import dao.LettersDAO;

/**
 * A data access object (DAO) providing persistence and search support for
 * Letters entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Letters
 * @author MyEclipse Persistence Tools
 */

public class LettersDAOImpl extends HibernateDaoSupport implements LettersDAO {
	private static final Log log = LogFactory.getLog(LettersDAOImpl.class);

	public void save(Letters transientInstance) {
		log.debug("saving Letters instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Letters persistentInstance) {
		log.debug("deleting Letters instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Letters findById(java.lang.Integer id) {
		log.debug("getting Letters instance with id: " + id);
		try {
			Letters instance = (Letters) getSession().get("daoNew.Letters", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Letters> findByProperty(String propertyName, Object value) {
		log.debug("finding Letters instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Letters as model where model."
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
	public List<Letters> findAll() {
		log.debug("finding all Letters instances");
		try {
			String queryString = "from Letters";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
}