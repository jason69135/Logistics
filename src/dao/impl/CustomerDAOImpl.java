package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.CustomerDAO;

import beans.Customer;

public class CustomerDAOImpl extends HibernateDaoSupport implements CustomerDAO {

	@Override
	public Customer findCustomer(String username) {
		String hql = "from Customer where username=?";
		@SuppressWarnings("unchecked")
		List<Customer> list = this.getHibernateTemplate().find(hql, username);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void insertCustomer(Customer customer) {
		this.getHibernateTemplate().save(customer);
	}

}
