package actions.useraction;

import services.UserService;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChangeEmailAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Customer customer;
	private UserService userService;
	private String newEmail;
	private String username;

	public String getNewEmail() {
		return newEmail;
	}

	public void setNewEmail(String newEmail) {
		this.newEmail = newEmail;
	}

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
		this.username = ActionContext.getContext().getSession().get("username")
				.toString();
		this.customer = new Customer();
		this.customer.setUsername(username);
		if (!username.equals(null)) {
			boolean flag = userService.changeEmail(customer, newEmail);
			if (flag) {
				ActionContext.getContext().getSession().remove("email");
				ActionContext.getContext().getSession().put("email", newEmail);
				return SUCCESS;
			}
		}
		return INPUT;
	}
}
