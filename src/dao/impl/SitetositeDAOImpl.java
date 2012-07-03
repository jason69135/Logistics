package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SitetositeDAO;

import beans.Sitetosite;

public class SitetositeDAOImpl extends HibernateDaoSupport implements SitetositeDAO{

	public void save(Sitetosite transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Sitetosite persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Sitetosite> findBysite(int sitea,int siteb) {

		String queryString = "from Sitetosite where sitea='"+sitea+"' and siteb='"+siteb+"'";
		return getHibernateTemplate().find(queryString);

	}

}