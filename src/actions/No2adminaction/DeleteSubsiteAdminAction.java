package actions.No2adminaction;
import services.No2AdminService;

import beans.Subsiteadmin;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteSubsiteAdminAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private No2AdminService no2adminservice;
	private Subsiteadmin subsiteadmin;

	public Subsiteadmin getSubsiteadmin() {
		return subsiteadmin;
	}

	public void setSubsiteadmin(Subsiteadmin subsiteadmin) {
		this.subsiteadmin = subsiteadmin;
	}

	public No2AdminService getNo2adminservice() {
		return no2adminservice;
	}

	public void setNo2adminservice(No2AdminService no2adminservice) {
		this.no2adminservice = no2adminservice;
	}

	@Override
	public String execute() {
		//页面获得姓名 
		if(this.no2adminservice.DeleteNo2admin(subsiteadmin.getUsername())){
			return SUCCESS;
		}
		return ERROR;
	}
}
