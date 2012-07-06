package actions.subsiteaction;

import java.util.List;

import services.SiteService;
import services.SubsiteService;

import beans.Siteadmin;
import beans.Subsite;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class DeleteSubsiteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private SubsiteService subsiteService;
	private SiteService siteService;

	public SiteService getSiteService() {
		return siteService;
	}

	public void setSiteService(SiteService siteService) {
		this.siteService = siteService;
	}

	public SubsiteService getSubsiteService() {
		return subsiteService;
	}

	public void setSubsiteService(SubsiteService subsiteService) {
		this.subsiteService = subsiteService;
	}

	@Override
	public String execute() {
		int subsiteid = (Integer)ActionContext.getContext().getSession().get("subsiteid");
		if(this.subsiteService.DeleteSubsite(subsiteid)){
			Siteadmin siteadmin = (Siteadmin)ActionContext.getContext().getSession().get("siteadmin");
			List<Subsite> subsitelist = this.siteService.SearchSite(siteadmin.getSiteid());
			ActionContext.getContext().getSession().put("subsitelist", subsitelist);
			return SUCCESS;
		}
		return ERROR;
	}
}
