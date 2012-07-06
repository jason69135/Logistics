package actions.routeaction;

import java.util.List;

import services.RouteService;
import beans.Route;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAllRouteAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private RouteService routeService;

	public RouteService getRouteService() {
		return routeService;
	}

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	@Override
	public String execute() {
		List<Route> list = this.routeService.SearchAllRoute();
		if (list.size() != 0) {
			ActionContext.getContext().getSession().put("routelist", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
