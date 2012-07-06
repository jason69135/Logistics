package actions.orderaction;

import java.util.List;

import services.NumberService;
import services.OrderService;
import services.SiteService;

import beans.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOrderandNumber extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int numberid;
	public int getNumberid() {
		return numberid;
	}

	public void setNumberid(int numberid) {
		this.numberid = numberid;
	}
	private OrderService orderService;
	private NumberService numberService;
	private SiteService siteService;

	public SiteService getSiteService() {
		return siteService;
	}

	public void setSiteService(SiteService siteService) {
		this.siteService = siteService;
	}

	public NumberService getNumberService() {
		return numberService;
	}

	public void setNumberService(NumberService numberService) {
		this.numberService = numberService;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	@Override
	public String execute() {
	int routeid = this.numberService.SearchRouteid(numberid).get(0).getRouteid();//路线
	List<Order> list = this.orderService.Findbyrouteid(routeid);
	System.out.println(list.get(0).getOrderNo());
	ActionContext.getContext().getSession().put("numberorder", list);
	ActionContext.getContext().getSession().put("numberid", numberid);
	return SUCCESS;
}
}
