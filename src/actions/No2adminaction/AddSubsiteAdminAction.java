package actions.No2adminaction;

import services.No2AdminService;

import com.opensymphony.xwork2.ActionSupport;

public class AddSubsiteAdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private No2AdminService no2adminservice;

	public No2AdminService getNo2adminservice() {
		return no2adminservice;
	}

	public void setNo2adminservice(No2AdminService no2adminservice) {
		this.no2adminservice = no2adminservice;
	}

	@Override
	public String execute() {
		//页面获得
		if(this.no2adminservice.AddNo2admin("","","",0)){
			return SUCCESS;
		}
		return ERROR;
	}
}
