package actions.useraction;

import services.UserService;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowPersonsetAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userService;
	private String usrename;
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String getUsrename() {
		return usrename;
	}

	public void setUsrename(String usrename) {
		this.usrename = usrename;
	}

	@Override
	public String execute() {
		this.usrename = ActionContext.getContext().getSession().get("username")
				.toString();
		Customer cus = this.userService.ShowPersonset(usrename);
		ActionContext.getContext().getSession().put("userinfo", cus);
		return SUCCESS;
	}
}
