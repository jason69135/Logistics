package services.impl;

import java.util.List;
import dao.SiteDAO;
import dao.SubsiteDAO;
import beans.Site;
import beans.Subsite;
import services.SiteService;

public class SiteServiceImpl implements SiteService {
	private SiteDAO siteDao;
	private SubsiteDAO subsiteDao;

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public SiteDAO getSiteDao() {
		return siteDao;
	}

	public void setSiteDao(SiteDAO siteDao) {
		this.siteDao = siteDao;
	}

	public List<Site> SearchAllSite() {
		List<Site> list = this.siteDao.findAll();
		return list;
	}
	
	public List<Subsite> SearchSite(int siteid){
		List<Subsite> list = this.subsiteDao.findBysiteid(siteid);
		return list;
	}
}
