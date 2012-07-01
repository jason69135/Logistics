package dao;
import java.util.List;

import beans.Route;

public interface RouteDAO{

	public void save(Route transientInstance);

	public void delete(Route persistentInstance);
	
	public List<Route> findAll();

}