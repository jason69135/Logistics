package dao.impl;

import java.util.List;
import javax.persistence.criteria.Order;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.OrderDAO;

/**
 * A data access object (DAO) providing persistence and search support for Order
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see daoNew.Order
 * @author MyEclipse Persistence Tools
 */

public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO {
	private static final Log log = LogFactory.getLog(OrderDAOImpl.class);

	public void save(Order transientInstance) {
		log.debug("saving Order instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Order persistentInstance) {
		log.debug("deleting Order instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Order findById(java.lang.Integer id) {
		log.debug("getting Order instance with id: " + id);
		try {
			Order instance = (Order) getSession().get("daoNew.Order", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	public List<Order> findByProperty(String propertyName, Object value) {
		log.debug("finding Order instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Order as model where model."
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
	public List<Order> findAll() {
		log.debug("finding all Order instances");
		try {
			String queryString = "from Order";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

}