package actions;

import services.VisitorServices;
import beans.Visitor;

import com.opensymphony.xwork2.ActionSupport;

public class ViewInfoAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	
	private Visitor visitor;
	private VisitorServices vs;
	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public VisitorServices getVs() {
		return vs;
	}

	public void setVs(VisitorServices vs) {
		this.vs = vs;
	}

	//ˢ�¸�����Ϣ������session
	public void flushInfo() {
	}

	public String execute() {
		return SUCCESS;
	}
}
