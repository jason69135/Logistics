package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SiteadminDAO;

import beans.Siteadmin;

public class SiteadminDAOImpl extends HibernateDaoSupport implements
		SiteadminDAO {

	public void save(Siteadmin transientInstance) {

		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Siteadmin persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}
	
	@SuppressWarnings("unchecked")
	public List<Siteadmin> findByname(String username){
		String queryString = "from Siteadmin where username='"+username+"'";
		return getHibernateTemplate().find(queryString);
	}

	@SuppressWarnings("unchecked")
	public List<Siteadmin> findAll() {
		String queryString = "from Siteadmin ";
		return getHibernateTemplate().find(queryString);
	}
}