package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.SubsiteadminDAO;
import beans.Subsiteadmin;

public class SubsiteadminDAOImpl extends HibernateDaoSupport implements
		SubsiteadminDAO {

	public void save(Subsiteadmin transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Subsiteadmin persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Subsiteadmin> findAll() {

		String queryString = "from Subsiteadmin";
		return getHibernateTemplate().find(queryString);
	}

	@SuppressWarnings("unchecked")
	public List<Subsiteadmin> findByname(String username) {
		String queryString = "from Subsiteadmin where username='" + username
				+ "'";
		return getHibernateTemplate().find(queryString);
	}
}