package actions.useraction;

import services.UserService;

import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchUserAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private UserService userservice;
	private String cusname;

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public UserService getUserservice() {
		return userservice;
	}

	public void setUserservice(UserService userservice) {
		this.userservice = userservice;
	}

	@Override
	public String execute() {
		Customer cus = this.userservice.searchUser(this.cusname);
		if (!cus.equals(null)) {
			ActionContext.getContext().getSession().put("cus", cus);
			return SUCCESS;
		}
		return ERROR;
	}
}
