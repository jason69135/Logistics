package actions.useraction;

import services.UserService;
import beans.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

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
		if (this.userService.userLogin(customer.getUsername(),
				customer.getPassword())) {
			return SUCCESS;
		}
		return INPUT;
	}
}
