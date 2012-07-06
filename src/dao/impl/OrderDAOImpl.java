package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.OrderDAO;
import beans.Order;

public class OrderDAOImpl extends HibernateDaoSupport implements OrderDAO {

	public void save(Order transientInstance) {
		getHibernateTemplate().save(transientInstance);
	}
	
	public void update(Order transientInstance) {
		getHibernateTemplate().update(transientInstance);
	}

	public void delete(Order persistentInstance) {

		getHibernateTemplate().delete(persistentInstance);

	}

	@SuppressWarnings("unchecked")
	public List<Order> findBycusid(int cusid) {
		String queryString = "from Order where cusid = '" + cusid + "'";
		return getHibernateTemplate().find(queryString);

	}

	public Order findByid(int id) {
		String queryString = "from Order where id = " + id + "";
		return (Order) getHibernateTemplate().find(queryString).get(0);
	}

	public Order findByorderno(String orderno) {
		String queryString = "from Order where orderNo = '" + orderno + "'";
		return (Order) getHibernateTemplate().find(queryString).get(0);
	}
	
	@SuppressWarnings("unchecked")
	public List<Order> findByall() {
		String queryString = "from Order";
		return getHibernateTemplate().find(queryString);
	}

	@SuppressWarnings("unchecked")
	public List<Order> findByrouteid(int routeid) {
		String queryString = "from Order where routeid = "+routeid+"";
		return getHibernateTemplate().find(queryString);		
	}
}