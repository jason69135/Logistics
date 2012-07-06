package services.impl;

import java.util.List;

import services.NewsService;

import dao.NewsDAO;

import beans.News;

public class NewsServiceImpl implements NewsService{
	
	private NewsDAO newsdao;
	public NewsDAO getNewsdao() {
		return newsdao;
	}
	public void setNewsdao(NewsDAO newsdao) {
		this.newsdao = newsdao;
	}
	
	
	public List<News> loadNews(){
		List<News> list = this.newsdao.findAll();
		return list;
	}
}
