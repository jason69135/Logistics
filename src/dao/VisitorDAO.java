package dao;

import beans.Visitor;

public interface VisitorDAO {
	public Visitor visitor(String username);

	public void insertVisitor(Visitor v);
}
