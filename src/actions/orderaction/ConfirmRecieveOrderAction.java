package actions.orderaction;

import java.util.List;

import services.NumberService;
import services.OrderService;
import services.SiteService;

import beans.Order;
import beans.Siteadmin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ConfirmRecieveOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private int numberid;
	private OrderService orderService;
	private NumberService numberService;
	private SiteService siteService;

	public int getNumberid() {
		return numberid;
	}

	public void setNumberid(int numberid) {
		this.numberid = numberid;
	}

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public NumberService getNumberService() {
		return numberService;
	}

	public void setNumberService(NumberService numberService) {
		this.numberService = numberService;
	}

	public SiteService getSiteService() {
		return siteService;
	}

	public void setSiteService(SiteService siteService) {
		this.siteService = siteService;
	}

	@Override
	public String execute() {
		Siteadmin siteadmin = (Siteadmin) ActionContext.getContext()
				.getSession().get("siteadmin");
//		String sitename = this.siteService.SearchSite(siteadmin.getSiteid())
//				.get(0).getSitename();
		// ActionContext.getContext().getSession().put("numberid",
		// this.numberid);
		// int routeid =
		// this.numberService.SearchRouteid(this.numberid).get(0).getRouteid();//路线
		List<Order> list = this.orderService.Findbyrouteid(0);
		ActionContext.getContext().getSession().put("recieveconfirmorder", list);
		for (int i = 0; i < list.size(); i++) {
			list.get(i).setStatus("您的货物已从" + "Sunlitun" + "配送点发出!");
			this.orderService.UpdateOrder(list.get(i));
		}
		return SUCCESS;
	}
}
