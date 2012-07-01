package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Order;


public class OrderDAOImpl extends HibernateDaoSupport {

	public void save(Order transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Order persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	public Order findById(java.lang.Integer id) {

		Order instance = (Order) getHibernateTemplate().get("haha.Order", id);
		return instance;

	}

	@SuppressWarnings("unchecked")
	public List<Order> findByProperty(String propertyName, Object value) {

		String queryString = "from Order as model where model." + propertyName
				+ "= ?";
		return getHibernateTemplate().find(queryString, value);
	}

}