package services.impl;

import java.util.List;

import dao.RouteDAO;

import beans.Route;
import services.RouteService;

public class RouteServiceImpl implements RouteService {
	private RouteDAO routeDao;

	public RouteDAO getRouteDao() {
		return routeDao;
	}

	public void setRouteDao(RouteDAO routeDao) {
		this.routeDao = routeDao;
	}

	public List<Route> SearchAllRoute() {
		return this.routeDao.findByAll();
	}
	
	public List<Route> SearchRoutebyid(int routeid){
		return this.routeDao.findByAll(routeid);
	}
}
