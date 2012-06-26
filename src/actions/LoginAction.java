package actions;

import services.VisitorServices;
import beans.Visitor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	public VisitorServices vs;
	private Visitor visitor;

	public void setVs(VisitorServices vs) {
		this.vs = vs;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public String execute() {
		boolean flag = this.vs.login(this.visitor);
		if (flag) {
			ActionContext.getContext().getSession().put("username",this.visitor.getUsername());
			return SUCCESS;
		} else
			return INPUT;
	}
}
