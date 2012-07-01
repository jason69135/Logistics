package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Subsiteadmin;

public class SubsiteadminDAOImpl extends HibernateDaoSupport {

	public void save(Subsiteadmin transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Subsiteadmin persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Subsiteadmin> findByProperty(String propertyName, Object value) {

		String queryString = "from Subsiteadmin as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);

	}
}