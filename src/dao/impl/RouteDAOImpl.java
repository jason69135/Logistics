package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Route;


public class RouteDAOImpl extends HibernateDaoSupport {

	public void save(Route transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Route persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);
	}

	@SuppressWarnings("unchecked")
	public List<Route> findByProperty(String propertyName, Object value) {

		String queryString = "from Route as model where model." + propertyName
				+ "= ?";
		return getHibernateTemplate().find(queryString, value);

	}

}