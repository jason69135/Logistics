package actions;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ManageOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {
		if (ActionContext.getContext().getSession().get("token") != null)
			return SUCCESS;
		return INPUT;
	}
}
