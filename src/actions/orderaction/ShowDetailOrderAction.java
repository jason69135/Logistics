package actions.orderaction;

import services.OrderService;

import beans.Order;

import com.opensymphony.xwork2.ActionSupport;

public class ShowDetailOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private OrderService orderservice;

	public OrderService getOrderservice() {
		return orderservice;
	}

	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}

	@Override
	public String execute() {
		Order order = this.orderservice.ShowDetailOrder(1);
		if (order.equals(null)) {
			return ERROR;
		}
		return SUCCESS;
	}
}
