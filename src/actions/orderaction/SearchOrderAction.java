package actions.orderaction;
import services.OrderService;

import beans.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchOrderAction extends ActionSupport {

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
		Order order = this.orderservice.SearchOrder(orderno);
		if (!order.equals(null)) {
			ActionContext.getContext().getSession().put("companyorder",order);
			return SUCCESS;
		}
		return ERROR;
	}
}
