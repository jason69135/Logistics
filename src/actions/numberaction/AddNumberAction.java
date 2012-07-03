package actions.numberaction;
import services.NumberService;
import beans.Number;

import com.opensymphony.xwork2.ActionSupport;

public class AddNumberAction extends ActionSupport {

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
		if(this.numberservice.AddNumber(number.getRouteid(), number.getStarttime(), number.getSize())){
			return SUCCESS;
		}
		return ERROR;
	}
}
