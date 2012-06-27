package dao.impl;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.DeliveryadminDAO;
import beans.Deliveryadmin;

public class DeliveryadminDAOImpl extends HibernateDaoSupport implements
		DeliveryadminDAO {
	private static final Log log = LogFactory.getLog(DeliveryadminDAO.class);

	@Override
	public void save(Deliveryadmin transientInstance) {
		log.debug("saving Deliveryadmin instance");
		try {
			getSession().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	@Override
	public void delete(Deliveryadmin persistentInstance) {
		log.debug("deleting Deliveryadmin instance");
		try {
			getSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	@Override
	public Deliveryadmin findById(Integer id) {
		log.debug("getting Deliveryadmin instance with id: " + id);
		try {
			Deliveryadmin instance = (Deliveryadmin) getSession().get(
					"daoNew.Deliveryadmin", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Deliveryadmin> findByProperty(String propertyName, Object value) {
		log.debug("finding Deliveryadmin instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Deliveryadmin as model where model."
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
	@Override
	public List<Deliveryadmin> findAll() {
		log.debug("finding all Deliveryadmin instances");
		try {
			String queryString = "from Deliveryadmin";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

}
