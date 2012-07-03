package actions.subsiteaction;
import java.util.List;

import services.SiteService;
import beans.Site;

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
		List<Site> list = this.siteservice.SearchAllSite();
		if(list.size()!=0){
			ActionContext.getContext().getSession().put("sitelist", list);
			return SUCCESS;
		}
		return SUCCESS;
	}
}
