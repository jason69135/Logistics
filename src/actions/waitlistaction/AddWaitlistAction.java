package actions.waitlistaction;

import java.util.List;

import services.OrderService;
import services.RouteService;
import services.WaitlistService;

import beans.Order;
import beans.Siteadmin;
import beans.Waitlist;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class AddWaitlistAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private WaitlistService waitlistService;
	private OrderService orderService;
	private RouteService routeService;
	List<Order> orederlist = null;

	public RouteService getRouteService() {
		return routeService;
	}

	public void setRouteService(RouteService routeService) {
		this.routeService = routeService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	private int numberid;

	public int getNumberid() {
		return numberid;
	}

	public void setNumberid(int numberid) {
		this.numberid = numberid;
	}

	public WaitlistService getWaitlistService() {
		return waitlistService;
	}

	public void setWaitlistService(WaitlistService waitlistService) {
		this.waitlistService = waitlistService;
	}

	@Override
	public String execute() {
		Siteadmin siteadmin = (Siteadmin) ActionContext.getContext()
				.getSession().get("siteadmin");
		int siteid = siteadmin.getSiteid();
		List<Order> list = this.orderService.ShowAllOrder();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("No："+list.get(i).getOrderNo());
			System.out.println("Status："+list.get(i).getStatus());
			int startid = this.routeService.SearchRoutebyid(
					list.get(i).getRouteid()).get(0).getStartsiteid();// 匹配起始点
			if (startid == siteadmin.getSiteid()
					&& list.get(i).getPriority().equals(1)) {
				this.orederlist.add(list.get(i));
				this.waitlistService.AddWaitlist(siteid,this.orederlist.get(i)
						.getOrderNo(),orederlist.get(i).getPriority(), numberid);
			}
		}
		
		List<Waitlist> waitlist = this.waitlistService.ShowWaitlist();
		ActionContext.getContext().getSession().put("showlist", waitlist);
		return SUCCESS;
	}
}
