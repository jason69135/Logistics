package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import dao.WaitlistDAO;

import beans.Waitlist;


public class WaitlistDAOImpl extends HibernateDaoSupport implements WaitlistDAO{

	public void save(Waitlist transientInstance) {
		
			getHibernateTemplate().save(transientInstance);
			
	}

	public void delete(Waitlist persistentInstance) {
			getHibernateTemplate().delete(persistentInstance);			
	}
	
	@SuppressWarnings("unchecked")
	public List<Waitlist> findAll(){
		String queryString = "from Waitlist";
		return getHibernateTemplate().find(queryString);
	}
}