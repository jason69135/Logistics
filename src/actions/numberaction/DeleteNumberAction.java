package actions.numberaction;

import services.NumberService;
import beans.Number;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteNumberAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private NumberService numberservice;
	private Number number;

	public Number getNumber() {
		return number;
	}

	public void setNumber(Number number) {
		this.number = number;
	}

	public NumberService getNumberservice() {
		return numberservice;
	}

	public void setNumberservice(NumberService numberservice) {
		this.numberservice = numberservice;
	}

	@Override
	public String execute() {
		//页面获取id
		this.numberservice.DeleteNumber(1);
		return SUCCESS;
	}
}
