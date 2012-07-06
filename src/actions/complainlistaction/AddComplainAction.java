package actions.complainlistaction;

import services.ComplainlistService;
import beans.Claims;
import com.opensymphony.xwork2.ActionSupport;

public class AddComplainAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private ComplainlistService complainlistService;
	private Claims claims;

	public Claims getClaims() {
		return claims;
	}

	public void setClaims(Claims claims) {
		this.claims = claims;
	}

	public ComplainlistService getComplainlistService() {
		return complainlistService;
	}

	public void setComplainlistService(ComplainlistService complainlistService) {
		this.complainlistService = complainlistService;
	}

	@Override
	public String execute() {
		if (this.complainlistService.AddComplain(this.claims.getOrderno(),
				this.claims.getPerson(), this.claims.getFee(), this.claims
						.getReason())) {
			System.out.println(this.claims.getOrderno());
			return SUCCESS;
		}
		return ERROR;
	}
}
