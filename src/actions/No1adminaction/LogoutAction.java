package actions.No1adminaction;

import com.opensymphony.xwork2.ActionSupport;

public class LogoutAction extends ActionSupport {

	private static final long serialVersionUID = 1L;

	@Override
	public String execute() {
		return SUCCESS;
		//没有业务,清空session
	}
}
