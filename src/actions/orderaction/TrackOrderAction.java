package actions.orderaction;

import services.OrderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class TrackOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private OrderService orderservice;
	private String orderno;

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	public OrderService getOrderservice() {
		return orderservice;
	}

	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}

	@Override
	public String execute() {
		if (!this.orderservice.TrackOrder(orderno).equals(null)) {
			String status = this.orderservice.TrackOrder(orderno).getStatus();
			ActionContext.getContext().getSession().put("status", status);
			return SUCCESS;
		}
		return ERROR;
	}
}
