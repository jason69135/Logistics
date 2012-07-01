package actions.useraction;

import services.UserService;
import beans.Customer;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChangePasswordAction extends ActionSupport {
	private static final long serialVersionUID = 1L;
	private Customer customer;
	private UserService userService;
	private String newPassword;
	private String username;

	public String getNewPassword() {
		return newPassword;
	}

	public void setNewPassword(String newPassword) {
		this.newPassword = newPassword;
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
		System.out.print("aaaaaaaaaaaaaaaaaaaaaaaa");
		this.username = ActionContext.getContext().getSession().get("username")
				.toString();
		this.customer.setUsername(username);
		if (!username.equals(null)) {
			boolean flag = userService.changePassword(customer, newPassword);
			if (flag)
				return SUCCESS;
		}
		return INPUT;
	}
}
