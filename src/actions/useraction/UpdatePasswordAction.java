package actions.useraction;

import services.UserService;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UpdatePasswordAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private String username;
	private String password;
	private Customer customer;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() {
		this.username = ActionContext.getContext().getSession().get("username")
				.toString();
		this.customer = new Customer();
		this.customer.setUsername(this.username);
		if (!username.equals(null)) {
			boolean flag = userService.changePassword(customer, this.password);
			if (flag) {
				return SUCCESS;
			}
		}
		return ERROR;
	}
}
