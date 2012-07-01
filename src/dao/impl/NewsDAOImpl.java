package dao.impl;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.News;

public class NewsDAOImpl extends HibernateDaoSupport {

	public void save(News transientInstance) {
			getHibernateTemplate().save(transientInstance);
	}

	public void delete(News persistentInstance) {
			getHibernateTemplate().delete(persistentInstance);
	}

	public News findById(java.lang.Integer id) {
			News instance = (News) getHibernateTemplate().get("haha.News", id);
			return instance;
	}

	
}