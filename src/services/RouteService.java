package services;
import java.util.List;

import beans.Route;

public interface RouteService {
	public List<Route> SearchAllRoute();
	public List<Route> SearchRoutebyid(int routeid);
}
