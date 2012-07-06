package actions.waitlistaction;

import java.util.List;

import services.WaitlistService;

import beans.Waitlist;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowWaitlistAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private WaitlistService waitlistService;

	public WaitlistService getWaitlistService() {
		return waitlistService;
	}

	public void setWaitlistService(WaitlistService waitlistService) {
		this.waitlistService = waitlistService;
	}

	@Override
	public String execute() {
		List<Waitlist> list = this.waitlistService.ShowWaitlist();
		if(list.size()!=0){
			ActionContext.getContext().getSession().put("waitlist", list);
			return SUCCESS;
		}
		return ERROR;
	}
}
