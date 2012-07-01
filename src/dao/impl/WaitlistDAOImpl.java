package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Waitlist;


public class WaitlistDAOImpl extends HibernateDaoSupport {

	public void save(Waitlist transientInstance) {
		
			getHibernateTemplate().save(transientInstance);
			
	}

	public void delete(Waitlist persistentInstance) {

			getHibernateTemplate().delete(persistentInstance);
			
	}

	
	@SuppressWarnings("unchecked")
	public List<Waitlist> findByProperty(String propertyName, Object value) {

			String queryString = "from Waitlist as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
	
	}
}