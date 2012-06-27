package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ReceiverDAO;

import beans.Receiver;

/**
 * A data access object (DAO) providing persistence and search support for
 * Receiver entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Receiver
 * @author MyEclipse Persistence Tools
 */

public class ReceiverDAOImpl extends HibernateDaoSupport implements ReceiverDAO {
	private static final Log log = LogFactory.getLog(ReceiverDAOImpl.class);

	public void save(Receiver transientInstance) {
		log.debug("saving Receiver instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Receiver persistentInstance) {
		log.debug("deleting Receiver instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Receiver findById(java.lang.Integer id) {
		log.debug("getting Receiver instance with id: " + id);
		try {
			Receiver instance = (Receiver) getSession().get("daoNew.Receiver",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Receiver> findByProperty(String propertyName, Object value) {
		log.debug("finding Receiver instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Receiver as model where model."
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
	public List<Receiver> findAll() {
		log.debug("finding all Receiver instances");
		try {
			String queryString = "from Receiver";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

}