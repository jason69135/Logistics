package daoNew;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.Query;
import org.hibernate.criterion.Example;

/**
 * A data access object (DAO) providing persistence and search support for
 * Subnumber entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Subnumber
 * @author MyEclipse Persistence Tools
 */

public class SubnumberDAO extends BaseHibernateDAO {
	private static final Log log = LogFactory.getLog(SubnumberDAO.class);

	public void save(Subnumber transientInstance) {
		log.debug("saving Subnumber instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Subnumber persistentInstance) {
		log.debug("deleting Subnumber instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Subnumber findById(java.lang.Integer id) {
		log.debug("getting Subnumber instance with id: " + id);
		try {
			Subnumber instance = (Subnumber) getSession().get(
					"daoNew.Subnumber", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Subnumber instance) {
		log.debug("finding Subnumber instance by example");
		try {
			List results = getSession().createCriteria("daoNew.Subnumber")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Subnumber instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Subnumber as model where model."
					+ propertyName + "= ?";
			Query queryObject = getSession().createQuery(queryString);
			queryObject.setParameter(0, value);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findAll() {
		log.debug("finding all Subnumber instances");
		try {
			String queryString = "from Subnumber";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Subnumber merge(Subnumber detachedInstance) {
		log.debug("merging Subnumber instance");
		try {
			Subnumber result = (Subnumber) getSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Subnumber instance) {
		log.debug("attaching dirty Subnumber instance");
		try {
			getSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Subnumber instance) {
		log.debug("attaching clean Subnumber instance");
		try {
			getSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}
}