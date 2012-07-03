package actions.newsaction;
import java.util.List;

import services.NewsService;

import beans.News;

import com.opensymphony.xwork2.ActionSupport;

public class LoadNewsAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private NewsService newservice;

	public NewsService getNewservice() {
		return newservice;
	}

	public void setNewservice(NewsService newservice) {
		this.newservice = newservice;
	}

	@Override
	public String execute() {
		List<News> list = this.newservice.loadNews();
		return SUCCESS;
	}
}
