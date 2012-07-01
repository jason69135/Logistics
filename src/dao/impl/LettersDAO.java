package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Letters;

public class LettersDAO extends HibernateDaoSupport {

	public void save(Letters transientInstance) {
			getHibernateTemplate().save(transientInstance);
	}

	public void delete(Letters persistentInstance) {
			getHibernateTemplate().delete(persistentInstance);
	}


	@SuppressWarnings("unchecked")
	public List<Letters> findAll() {
			String queryString = "from Letters";
			return getHibernateTemplate().find(queryString);
	}
}