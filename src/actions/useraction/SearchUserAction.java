package actions.useraction;

import services.UserService;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Customer customer;
	private UserService userService;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() {
		Customer seachUser = this.userService.searchUser(customer);
		ActionContext.getContext().getSession().put("searchUser", seachUser);
		return SUCCESS;
	}
}
