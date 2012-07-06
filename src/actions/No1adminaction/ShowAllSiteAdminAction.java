package actions.No1adminaction;

import java.util.List;

import services.No1AdminService;

import beans.Siteadmin;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowAllSiteAdminAction extends ActionSupport {
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
		List<Siteadmin> list = this.no1adminservice.ShowNo1admin();
		if (list.size() != 0) {
			ActionContext.getContext().getSession().put("siteadminlist", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
