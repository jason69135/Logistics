package actions.numberaction;

import java.util.List;
import beans.Number;
import services.NumberService;

import com.opensymphony.xwork2.ActionSupport;

public class SearchNumberAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private NumberService numberservice;
	private String startsite;
	private String finishsite;
	private int starttime;

	public String getStartsite() {
		return startsite;
	}

	public void setStartsite(String startsite) {
		this.startsite = startsite;
	}

	public String getFinishsite() {
		return finishsite;
	}

	public void setFinishsite(String finishsite) {
		this.finishsite = finishsite;
	}

	public int getStarttime() {
		return starttime;
	}

	public void setStarttime(int starttime) {
		this.starttime = starttime;
	}

	public NumberService getNumberservice() {
		return numberservice;
	}

	public void setNumberservice(NumberService numberservice) {
		this.numberservice = numberservice;
	}

	@Override
	public String execute() {
		// 页面获取
		List<Number> list = this.numberservice
				.ShowNumber(startsite, finishsite);
		if (list.size() != 0) {
			return SUCCESS;
		}
		return ERROR;
	}
}
