package actions.numberaction;
import java.util.List;

import services.NumberService;
import beans.Number;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllNumberAction extends ActionSupport {

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
		List<Number> list = this.numberservice.ShowAllNumber();
		if(list.size()!=0){
			ActionContext.getContext().getSession().put("numberlist", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
