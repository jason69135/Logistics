package actions.messageaction;

import services.MessageService;

import com.opensymphony.xwork2.ActionSupport;

public class ShowDetailMessageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private MessageService messageservice;

	public MessageService getMessageservice() {
		return messageservice;
	}

	public void setMessageservice(MessageService messageservice) {
		this.messageservice = messageservice;
	}

	@Override
	public String execute() {
		//页面获取messageid
		this.messageservice.ShowDetailMessage(2);
		return SUCCESS;
	}
}
