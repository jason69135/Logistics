package actions.orderaction;

import services.OrderService;
import beans.Order;
import java.util.List;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllOrderAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private OrderService orderService;

	public OrderService getOrderService() {
		return orderService;
	}

	public void setOrderService(OrderService orderService) {
		this.orderService = orderService;
	}

	public String execute() {
		List<Order> list = this.orderService.ShowAllOrder();
		if (list.size() != 0) {
			ActionContext.getContext().getSession().put("checkorder", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
