package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SubsiteDAO;

import beans.Subsite;

public class SubsiteDAOImpl extends HibernateDaoSupport implements SubsiteDAO{

	public void save(Subsite transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Subsite persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Subsite> findByname(String subsitename) {

		String queryString = "from Subsite where sitename='" + subsitename + "'";
		return getHibernateTemplate().find(queryString);
	}

}