package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.RouteDAO;
import beans.Route;

public class RouteDAOImpl extends HibernateDaoSupport implements RouteDAO {

	public void save(Route transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Route persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);
	}

	public Route findBysiteid(int startsiteid, int finishsiteid) {
		String queryString = "from Route where startsiteid = " + startsiteid
				+ " and finishsiteid = " + finishsiteid + "";
		return (Route) getHibernateTemplate().find(queryString).get(0);
	}

	@SuppressWarnings("unchecked")
	public List<Route> findByAll() {
		String queryString = "from Route";
		return getHibernateTemplate().find(queryString);
	}

}