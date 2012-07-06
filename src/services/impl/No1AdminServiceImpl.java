package services.impl;

import java.util.List;
import beans.Siteadmin;
import dao.SiteDAO;
import dao.SiteadminDAO;
import services.No1AdminService;

public class No1AdminServiceImpl implements No1AdminService {
	private SiteadminDAO siteadminDao;
	private SiteDAO siteDao;

	public SiteDAO getSiteDao() {
		return siteDao;
	}

	public void setSiteDao(SiteDAO siteDao) {
		this.siteDao = siteDao;
	}

	private Siteadmin siteadmin;

	public Siteadmin getSiteadmin() {
		return siteadmin;
	}

	public void setSiteadmin(Siteadmin siteadmin) {
		this.siteadmin = siteadmin;
	}

	public SiteadminDAO getSiteadminDao() {
		return siteadminDao;
	}

	public void setSiteadminDao(SiteadminDAO siteadminDao) {
		this.siteadminDao = siteadminDao;
	}

	public boolean No1adminLogin(String username, String password) {
		List<Siteadmin> list = this.siteadminDao.findByname(username);
		if (list.size() != 0) {// 先判断用户存在
			if (list.get(0).getPassword().equals(password)) {
				return true;
			}
		}
		return false;
	}

	public boolean AddNo1admin(String username, String password,
			String sitename, int right) {
		int siteid = this.siteDao.findByname(sitename).get(0).getId();
		this.siteadmin.setUsername(username);
		this.siteadmin.setPassword(password);
		this.siteadmin.setRight(right);
		this.siteadmin.setSiteid(siteid);
		this.siteadminDao.save(siteadmin);
		return true;
	}

	public boolean DeleteNo1admin(String username) {
		this.siteadmin.setUsername(username);
		this.siteadminDao.delete(siteadmin);
		return true;
	}

	public List<Siteadmin> ShowNo1admin() {
		return this.siteadminDao.findAll();
	}
	
	public Siteadmin ShowNo1admininfo(String adminname){
		return this.siteadminDao.findByname(adminname).get(0);
	}
}
