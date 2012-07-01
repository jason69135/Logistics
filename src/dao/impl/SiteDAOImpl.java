package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Site;

public class SiteDAOImpl extends HibernateDaoSupport {

	public void save(Site transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Site persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Site> findByProperty(String propertyName, Object value) {

			String queryString = "from Site as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);

	}

}