package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Number;


public class NumberDAOImpl extends HibernateDaoSupport {

	public void save(Number transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Number persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	public Number findById(java.lang.Integer id) {
		Number instance = (Number) getHibernateTemplate()
				.get("haha.Number", id);
		return instance;
	}

}