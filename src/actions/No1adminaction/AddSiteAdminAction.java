package actions.No1adminaction;

import services.No1AdminService;
import com.opensymphony.xwork2.ActionSupport;

public class AddSiteAdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private No1AdminService no1adminservice;

	public No1AdminService getNo1adminservice() {
		return no1adminservice;
	}

	public void setNo1adminservice(No1AdminService no1adminservice) {
		this.no1adminservice = no1adminservice;
	}

	@Override
	public String execute() {
		//页面获得
		if(this.no1adminservice.AddNo1admin("","","",0)){
			return SUCCESS;
		}
		return ERROR;
	}
}
