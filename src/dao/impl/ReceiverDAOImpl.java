package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Receiver;


public class ReceiverDAOImpl extends HibernateDaoSupport {

	public void save(Receiver transientInstance) {

		getHibernateTemplate().save(transientInstance);

	}

	public void delete(Receiver persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Receiver> findByProperty(String propertyName, Object value) {

		String queryString = "from Receiver as model where model."
				+ propertyName + "= ?";
		return getHibernateTemplate().find(queryString, value);

	}

}