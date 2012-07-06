package actions.orderaction;

import java.util.List;

import services.OrderService;
import beans.Order;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckOrderAction extends ActionSupport {

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
		Order order = (Order)ActionContext.getContext().getSession().get("Needorder");
		order.setCheckstate("已审核");
		this.orderservice.UpdateOrder(order);
		List<Order> list = this.orderservice.ShowAllOrder();
		if (list.size() != 0) {
			ActionContext.getContext().getSession().put("checkorder", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
