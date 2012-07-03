package actions.sitetositeaction;

import services.SiteSiteService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class CheckFeeAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private SiteSiteService sitesiteService;
	private String subsitenamea;
	private String subsitenameb;

	public String getSubsitenamea() {
		return subsitenamea;
	}

	public void setSubsitenamea(String subsitenamea) {
		this.subsitenamea = subsitenamea;
	}

	public String getSubsitenameb() {
		return subsitenameb;
	}

	public void setSubsitenameb(String subsitenameb) {
		this.subsitenameb = subsitenameb;
	}

	public SiteSiteService getSitesiteService() {
		return sitesiteService;
	}

	public void setSitesiteService(SiteSiteService sitesiteService) {
		this.sitesiteService = sitesiteService;
	}

	@Override
	public String execute() {
		float fee = this.sitesiteService.CheckFee(this.subsitenamea, this.subsitenameb);
		ActionContext.getContext().getSession().put("fee",
				fee+" ");
		return SUCCESS;
	}
}
