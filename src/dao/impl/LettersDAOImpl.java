package dao.impl;

import java.util.List;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import dao.LettersDAO;
import beans.Letters;

public class LettersDAOImpl extends HibernateDaoSupport implements LettersDAO{

	public void save(Letters transientInstance) {
			getHibernateTemplate().save(transientInstance);
	}

	public void delete(Letters persistentInstance) {
			getHibernateTemplate().delete(persistentInstance);
	}


	@SuppressWarnings("unchecked")
	public List<Letters> find(int userid) {
			String queryString = "from Letters where userid='"+userid+"'";
			return getHibernateTemplate().find(queryString);
	}
	
	public Letters findByid(int messageid){
		String queryString = "from Letters where id='"+messageid+"'";
		return (Letters) getHibernateTemplate().find(queryString).get(0);		
	}
	
	@SuppressWarnings("unchecked")
	public List<Letters> findByUser(int userid ){
		String queryString = "from Letters where userid='"+userid+"'";
		return getHibernateTemplate().find(queryString);		
	}
	
	public Letters update(int messageid){
		String queryString = "update Letters set state = '已读' where id='"+messageid+"' ";
		return (Letters) getHibernateTemplate().find(queryString).get(0);
	}
}