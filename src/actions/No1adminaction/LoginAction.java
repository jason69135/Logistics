package actions.No1adminaction;

import services.No1AdminService;

import beans.Siteadmin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private No1AdminService no1adminservice;
	private Siteadmin siteadmin;

	public Siteadmin getSiteadmin() {
		return siteadmin;
	}

	public void setSiteadmin(Siteadmin siteadmin) {
		this.siteadmin = siteadmin;
	}

	public No1AdminService getNo1adminservice() {
		return no1adminservice;
	}

	public void setNo1adminservice(No1AdminService no1adminservice) {
		this.no1adminservice = no1adminservice;
	}

	@Override
	public String execute() {
		//頁面
		if(this.no1adminservice.No1adminLogin(this.siteadmin.getUsername(), this.siteadmin.getPassword())){
			Siteadmin admin = this.no1adminservice.ShowNo1admininfo(this.siteadmin.getUsername());
			ActionContext.getContext().getSession().put("siteadmin", admin);
			return SUCCESS;
		}
		return ERROR;
	}
}
