package actions.messageaction;

import java.util.List;
import services.MessageService;
import beans.Letters;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ShowMessageAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private MessageService messageservice;
	private Customer customer;
	private Letters letters;
	private String username;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Letters getLetters() {
		return letters;
	}

	public void setLetters(Letters letters) {
		this.letters = letters;
	}

	public MessageService getMessageservice() {
		return messageservice;
	}

	public void setMessageservice(MessageService messageservice) {
		this.messageservice = messageservice;
	}

	@Override
	public String execute() {
		// 从session中获取用户名
		this.username = ActionContext.getContext().getSession().get(
		"username").toString();
		List<Letters> list = this.messageservice.ShowMessage(this.username);
		ActionContext.getContext().getSession().put("message", list);
		return SUCCESS;
	}
}
