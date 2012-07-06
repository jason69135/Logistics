package services.impl;

import beans.Subsite;
import dao.SubsiteDAO;
import services.SubsiteService;

public class SubsiteServiceImpl implements SubsiteService{
	private SubsiteDAO subsiteDao;
	
	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}
	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}
	public boolean DeleteSubsite(int subsiteid){
		System.out.println("subsiteid"+subsiteid);
		Subsite subsite = new Subsite();
		subsite.setId(subsiteid);
		this.subsiteDao.delete(subsite);
		return true;
	}
}
