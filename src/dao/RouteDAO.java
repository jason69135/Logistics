package dao;

import java.util.List;

import beans.Route;

public interface RouteDAO {

	public void save(Route transientInstance);

	public void delete(Route persistentInstance);

	public Route findBysiteid(int startsiteid, int finishsiteid);// 起始和结束站点,线路唯一

	public List<Route> findByAll();

}