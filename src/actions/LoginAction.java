package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String logOut() {
		ActionContext.getContext().getSession().remove("token");
		return SUCCESS;
	}

	public String execute() {
		ActionContext.getContext().getSession().put("token", getUsername());
		return SUCCESS;
	}
}
