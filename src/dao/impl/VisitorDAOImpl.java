package dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import beans.Visitor;
import dao.VisitorDAO;

public class VisitorDAOImpl extends HibernateDaoSupport implements VisitorDAO {

	@Override
	public Visitor visitor(String username) {
		String hql = "from Visitor where username=?";
		@SuppressWarnings("unchecked")
		List<Visitor> list = this.getHibernateTemplate().find(hql, username);
		if (list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

	@Override
	public void insertVisitor(Visitor v) {
		v.setAuthority("normal");
		this.getHibernateTemplate().save(v);
	}

}
