package actions.No2adminaction;

import services.No2AdminService;
import beans.Subsiteadmin;

import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private No2AdminService no2adminservice;
	private Subsiteadmin subsiteadmin;

	public No2AdminService getNo2adminservice() {
		return no2adminservice;
	}

	public void setNo2adminservice(No2AdminService no2adminservice) {
		this.no2adminservice = no2adminservice;
	}

	public Subsiteadmin getSubsiteadmin() {
		return subsiteadmin;
	}

	public void setSubsiteadmin(Subsiteadmin subsiteadmin) {
		this.subsiteadmin = subsiteadmin;
	}

	@Override
	public String execute() {
		//頁面
		if(this.no2adminservice.No2adminLogin(subsiteadmin.getUsername(), subsiteadmin.getPassword())){
			return SUCCESS;
		}
		return ERROR;
	}
}
