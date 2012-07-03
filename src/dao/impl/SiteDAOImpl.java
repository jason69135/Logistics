package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SiteDAO;

import beans.Site;

public class SiteDAOImpl extends HibernateDaoSupport implements SiteDAO {

	public void save(Site transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Site persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Site> findByname(String sitename) {

		String queryString = "from Site where sitename='" + sitename + "'";
		return getHibernateTemplate().find(queryString);

	}
	
	@SuppressWarnings("unchecked")
	public List<Site> findAll(){
		String queryString = "from Site";
		return getHibernateTemplate().find(queryString);
	}

}