package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.ReceiverDAO;

import beans.Receiver;

public class ReceiverDAOImpl extends HibernateDaoSupport implements ReceiverDAO {

	public void save(Receiver transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Receiver persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Receiver> findByName(String receivename){
		String queryString = "from Receiver where username='"+receivename+"'";
	return getHibernateTemplate().find(queryString);
	}
}