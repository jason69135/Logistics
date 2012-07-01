package dao.impl;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Order;

/**
 * A data access object (DAO) providing persistence and search support for Order
 * entities. Transaction control of the save(), update() and delete() operations
 * can directly support Spring container-managed transactions or they can be
 * augmented to handle user-managed Spring transactions. Each of these methods
 * provides additional information for how to configure it for the desired type
 * of transaction control.
 * 
 * @see beans.Order
 * @author MyEclipse Persistence Tools
 */

public class OrderDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(OrderDAO.class);
	// property constants
	public static final String ORDER_NO = "orderNo";
	public static final String GOODNAME = "goodname";
	public static final String WEIGHT = "weight";
	public static final String SPRICE = "sprice";
	public static final String FEE = "fee";
	public static final String REMARK = "remark";
	public static final String CUSID = "cusid";
	public static final String PRIORITY = "priority";
	public static final String NUMBERID = "numberid";
	public static final String RECIEVEID = "recieveid";
	public static final String PAYWAY = "payway";
	public static final String PAYSTATE = "paystate";
	public static final String CHECKSTATE = "checkstate";
	public static final String BREAKSTATE = "breakstate";
	public static final String STATUS = "status";
	public static final String LOSTSTATE = "loststate";

	@Override
	protected void initDao() {
		// do nothing
	}

	public void save(Order transientInstance) {
		log.debug("saving Order instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Order persistentInstance) {
		log.debug("deleting Order instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Order findById(java.lang.Integer id) {
		log.debug("getting Order instance with id: " + id);
		try {
			Order instance = (Order) getHibernateTemplate().get("haha.Order",
					id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Order instance) {
		log.debug("finding Order instance by example");
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
		log.debug("finding Order instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Order as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByOrderNo(Object orderNo) {
		return findByProperty(ORDER_NO, orderNo);
	}

	public List findByGoodname(Object goodname) {
		return findByProperty(GOODNAME, goodname);
	}

	public List findByWeight(Object weight) {
		return findByProperty(WEIGHT, weight);
	}

	public List findBySprice(Object sprice) {
		return findByProperty(SPRICE, sprice);
	}

	public List findByFee(Object fee) {
		return findByProperty(FEE, fee);
	}

	public List findByRemark(Object remark) {
		return findByProperty(REMARK, remark);
	}

	public List findByCusid(Object cusid) {
		return findByProperty(CUSID, cusid);
	}

	public List findByPriority(Object priority) {
		return findByProperty(PRIORITY, priority);
	}

	public List findByNumberid(Object numberid) {
		return findByProperty(NUMBERID, numberid);
	}

	public List findByRecieveid(Object recieveid) {
		return findByProperty(RECIEVEID, recieveid);
	}

	public List findByPayway(Object payway) {
		return findByProperty(PAYWAY, payway);
	}

	public List findByPaystate(Object paystate) {
		return findByProperty(PAYSTATE, paystate);
	}

	public List findByCheckstate(Object checkstate) {
		return findByProperty(CHECKSTATE, checkstate);
	}

	public List findByBreakstate(Object breakstate) {
		return findByProperty(BREAKSTATE, breakstate);
	}

	public List findByStatus(Object status) {
		return findByProperty(STATUS, status);
	}

	public List findByLoststate(Object loststate) {
		return findByProperty(LOSTSTATE, loststate);
	}

	public List findAll() {
		log.debug("finding all Order instances");
		try {
			String queryString = "from Order";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Order merge(Order detachedInstance) {
		log.debug("merging Order instance");
		try {
			Order result = getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Order instance) {
		log.debug("attaching dirty Order instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Order instance) {
		log.debug("attaching clean Order instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OrderDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OrderDAO) ctx.getBean("OrderDAO");
	}
}