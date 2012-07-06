package actions.useraction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import services.UserService;
import beans.Customer;

public class UpdateEmailAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private UserService userService;
	private String username;
	private String newemail;
	private Customer customer;

	public String getNewemail() {
		return newemail;
	}

	public void setNewemail(String newemail) {
		this.newemail = newemail;
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
		{
			this.username = ActionContext.getContext().getSession().get(
					"username").toString();
			this.customer = new Customer();
			this.customer.setUsername(username);
			if (!username.equals(null)) {
				boolean flag = userService.changeEmail(customer, this.newemail);
				if (flag) {
					return SUCCESS;
				}
			}
			return ERROR;
		}
	}
}
