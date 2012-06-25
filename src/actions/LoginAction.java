package actions;

import java.util.Map;

import services.VisitorServices;

import beans.Visitor;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Map<String, Object> visitorToken;
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
		if (flag){
			visitorToken.put(visitor.getUsername(), vs.getToken(visitor));
			ActionContext.getContext().setSession(visitorToken);
			return SUCCESS;}
		else
			return INPUT;
	}
}
