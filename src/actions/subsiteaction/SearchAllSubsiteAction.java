package actions.subsiteaction;
import java.util.List;

import services.SiteService;
import beans.Siteadmin;
import beans.Subsite;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class SearchAllSubsiteAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private SiteService siteservice;

	public SiteService getSiteservice() {
		return siteservice;
	}

	public void setSiteservice(SiteService siteservice) {
		this.siteservice = siteservice;
	}
	
	@Override
	public String execute() {
			Siteadmin siteadmin = (Siteadmin)ActionContext.getContext().getSession().get("siteadmin");
			List<Subsite> subsitelist = this.siteservice.SearchSite(siteadmin.getSiteid());
			ActionContext.getContext().getSession().put("subsitelist", subsitelist);
		return SUCCESS;
	}
}
