package actions.useraction;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {
		String username = ActionContext.getContext().getSession().get("username").toString();
		if(!username.isEmpty()){
			ActionContext.getContext().getSession().clear();
			return SUCCESS;
		}
		return ERROR;
	}
}
