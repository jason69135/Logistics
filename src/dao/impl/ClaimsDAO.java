package dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Claims;

public class ClaimsDAO extends HibernateDaoSupport implements dao.ClaimsDAO {

	public void save(Claims transientInstance) {
			getSession().save(transientInstance);
	}

	public void delete(Claims persistentInstance) {		
			getSession().delete(persistentInstance);
	}

	@SuppressWarnings("unchecked")
	public List<Claims> findAll() {
			String queryString = "from Claims";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
	}

}