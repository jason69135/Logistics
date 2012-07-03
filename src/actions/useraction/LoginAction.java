package actions.useraction;

import services.MessageService;
import services.NewsService;
import services.UserService;
import beans.Customer;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Customer customer;
	private UserService userService;
	private NewsService newsService;
	private MessageService messageService;
	private int unread;
	private String news;

	public String getNews() {
		return news;
	}

	public void setNews(String news) {
		this.news = news;
	}

	public NewsService getNewsService() {
		return newsService;
	}

	public void setNewsService(NewsService newsService) {
		this.newsService = newsService;
	}

	public int getUnread() {
		return unread;
	}

	public void setUnread(int unread) {
		this.unread = unread;
	}

	public MessageService getMessageService() {
		return messageService;
	}

	public void setMessageService(MessageService messageService) {
		this.messageService = messageService;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Override
	public String execute() {
		if (this.userService.userLogin(customer.getUsername(), customer
				.getPassword())) {
			ActionContext.getContext().getSession().put("username",
					customer.getUsername());
			this.unread = this.messageService.GetunreadMessage(customer
					.getUsername());// 未读站内信
			this.news = this.newsService.loadNews().get(0).getContent();//新闻
			return SUCCESS;
		}
		return ERROR;
	}
}
