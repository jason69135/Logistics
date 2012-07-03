package actions.orderaction;

import java.util.List;

import org.apache.struts2.ServletActionContext;

import services.OrderService;
import javax.servlet.http.HttpSession;
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
		HttpSession session = ServletActionContext.getRequest().getSession();
		String username = (String)session.getAttribute("username");
		List<Order> list = this.orderservice.CheckOrder(username);
		ActionContext.getContext().getSession().put("orderlist", list);
		return SUCCESS;
	}
}
