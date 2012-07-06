package actions.orderaction;

import java.util.List;

import services.OrderService;

import beans.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowOrder2Action extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private OrderService orderService;
	

	public OrderService getOrderService() {
		return orderService;
	}


	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}


	@Override
	public String execute() {
		List<Order> list = this.orderService.ShowAllOrder();
		ActionContext.getContext().getSession().put("allorder", list);
		return SUCCESS;
	}
}
