package services;

import beans.Visitor;

public interface VisitorServices {
	public boolean login(Visitor v);

	public void register(Visitor v);
	
	public String getToken(Visitor v);
}
