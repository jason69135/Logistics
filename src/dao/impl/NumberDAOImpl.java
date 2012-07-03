package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.NumberDAO;

import beans.Number;


public class NumberDAOImpl extends HibernateDaoSupport implements NumberDAO{

	public void save(Number transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Number persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);
	}

	@SuppressWarnings("unchecked")
	public List<Number> findById(int routeid) {//根据routeid查询
		String queryString = "from Number where routeid = '"+routeid+"'";
		return getHibernateTemplate().find(queryString);
	}
	
	@SuppressWarnings("unchecked")
	public List<Number> findAll(){
		String queryString = "from Number ";
		return getHibernateTemplate().find(queryString);
	}

}