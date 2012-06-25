package actions;

import services.VisitorServices;
import beans.Visitor;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Visitor visitor;
	private VisitorServices vs;

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public void setVs(VisitorServices vs) {
		this.vs = vs;
	}

	public String execute() {
		this.vs.register(this.visitor);
		return SUCCESS;
	}
}
