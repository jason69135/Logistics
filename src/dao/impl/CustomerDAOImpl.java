package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import beans.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements
		dao.CustomerDAO {

	public void save(Customer transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}

	public void delete(Customer persistentInstance) {
		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Customer> find(String username) {
		String queryString = "from Customer where username='" + username + "'";
		return getHibernateTemplate().find(queryString);
	}

	@SuppressWarnings("unchecked")
	public List<Customer> findByProperty(String value, String property) {
		String queryString = "from Customer where " + property + "='" + value
				+ "'";
		return getHibernateTemplate().find(queryString);
	}

	public void update(Customer persistentInstance) {
		this.getHibernateTemplate().update(persistentInstance);
	}
}