package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.NewsDAO;

import beans.News;

public class NewsDAOImpl extends HibernateDaoSupport implements NewsDAO{

	public void save(News transientInstance) {
			getHibernateTemplate().save(transientInstance);
	}

	public void delete(News persistentInstance) {
			getHibernateTemplate().delete(persistentInstance);
	}

	@SuppressWarnings("unchecked")
	public List<News> findAll() {
		String queryString = "from News";
		return getHibernateTemplate().find(queryString);
	}

	
}