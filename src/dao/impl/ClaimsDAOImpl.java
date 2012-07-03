package dao.impl;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ClaimsDAO;

import beans.Claims;

public class ClaimsDAOImpl extends HibernateDaoSupport implements ClaimsDAO {

	public void save(Claims transientInstance) {
		System.out.println("yangfan");
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Claims persistentInstance) {
		getHibernateTemplate().save(persistentInstance);
	}

	// @SuppressWarnings("unchecked")
	// public List<Claims> findAll() {
	// String queryString = "from Claims";
	// return queryObject.list();
	// }

}