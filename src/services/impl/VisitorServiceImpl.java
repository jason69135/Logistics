package services.impl;

import dao.VisitorDAO;
import beans.Visitor;
import services.VisitorServices;

public class VisitorServiceImpl implements VisitorServices {
	private VisitorDAO vd;

	public VisitorDAO getVd() {
		return vd;
	}

	public void setVd(VisitorDAO vd) {
		this.vd = vd;
	}

	@Override
	public boolean login(Visitor v) {
		Visitor visitor = this.vd.visitor(v.getUsername());
		System.out.print(visitor.getPassword());
		System.out.print(v.getPassword());
		if (visitor.getPassword().equals(v.getPassword()))
			return true;
		else
			return false;
	}

	@Override
	public void register(Visitor v) {
		this.vd.insertVisitor(v);
	}

	@Override
	public String getToken(Visitor v) {
		String token = v.getUsername() + v.getAuthority();
		return token;
	}

}
