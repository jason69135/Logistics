package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Subsite;

public class SubsiteDAOImpl extends HibernateDaoSupport {

	public void save(Subsite transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Subsite persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Subsite> findByProperty(String propertyName, Object value) {

		String queryString = "from Subsite as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);
	}

}