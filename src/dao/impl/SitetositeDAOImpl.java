package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Sitetosite;

public class SitetositeDAOImpl extends HibernateDaoSupport {

	public void save(Sitetosite transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Sitetosite persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Sitetosite> findByProperty(String propertyName, Object value) {

		String queryString = "from Sitetosite as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);

	}

}