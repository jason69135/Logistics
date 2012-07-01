package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Validate;

public class ValidateDAOImpl extends HibernateDaoSupport {

	public void save(Validate transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Validate persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Validate> findByProperty(String propertyName, Object value) {

		String queryString = "from Validate as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);

	}

}