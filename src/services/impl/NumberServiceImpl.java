package services.impl;

import java.util.List;

import dao.NumberDAO;
import dao.RouteDAO;
import dao.SubsiteDAO;
import beans.Number;
import beans.Route;
import services.NumberService;

public class NumberServiceImpl implements NumberService {
	private NumberDAO numberDao;
	private Number number;
	private Route route;
	private RouteDAO routeDao;
	private SubsiteDAO subsiteDao;

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	public RouteDAO getRouteDao() {
		return routeDao;
	}

	public void setRouteDao(RouteDAO routeDao) {
		this.routeDao = routeDao;
	}

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public NumberDAO getNumberDao() {
		return numberDao;
	}

	public void setNumberDao(NumberDAO numberDao) {
		this.numberDao = numberDao;
	}

	public boolean AddNumber(int routeid, int time, int size) {
		this.number.setRouteid(routeid);
		this.number.setStarttime(time);
		this.number.setSize(size);
		this.numberDao.save(number);
		return true;
	}

	public boolean DeleteNumber(int id) {
		this.number.setId(id);
		this.numberDao.delete(number);
		return true;
	}

	public boolean SearchNumber(String startsite, String finishsite,
			int starttime) {
		int startsiteid = this.subsiteDao.findByname(startsite).get(0).getSiteid();
		int finishsiteid = this.subsiteDao.findByname(finishsite).get(0).getSiteid();
		this.route = this.routeDao.findBysiteid(startsiteid, finishsiteid);
		this.numberDao.findById(this.route.getId());
		return true;
	}

	public List<Number> ShowNumber(String startsite, String finishsite) {
		int startsiteid = this.subsiteDao.findByname(startsite).get(0).getSiteid();
		int finishsiteid = this.subsiteDao.findByname(finishsite).get(0).getSiteid();
		this.route = this.routeDao.findBysiteid(startsiteid, finishsiteid);
		List<Number> list = this.numberDao.findById(this.route.getId());
		return list;
	}
	
	public List<Number> SearchRouteid(int numberid){
		return this.numberDao.findBy(numberid);
	}
	
	public List<Number> findByrouteid(int routeid){
		return this.numberDao.findById(routeid);
	}

	public List<Number> ShowAllNumber() {
		// TODO Auto-generated method stub
		return null;
	}

}
