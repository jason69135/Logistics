package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Siteadmin;

public class SiteadminDAOImpl extends HibernateDaoSupport {

	public void save(Siteadmin transientInstance) {

		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Siteadmin persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Siteadmin> findByProperty(String propertyName, Object value) {

		String queryString = "from Siteadmin as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);
	}
}