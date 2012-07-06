package services.impl;

import java.util.List;

import services.No2AdminService;
import beans.Subsiteadmin;
import dao.SubsiteDAO;
import dao.SubsiteadminDAO;

public class No2AdminServiceImpl implements No2AdminService{
	private SubsiteadminDAO subsiteadminDao;
	private SubsiteDAO subsiteDao;
	private Subsiteadmin subsiteadmin;
	
	public SubsiteadminDAO getSubsiteadminDao() {
		return subsiteadminDao;
	}

	public void setSubsiteadminDao(SubsiteadminDAO subsiteadminDao) {
		this.subsiteadminDao = subsiteadminDao;
	}

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public Subsiteadmin getSubsiteadmin() {
		return subsiteadmin;
	}

	public void setSubsiteadmin(Subsiteadmin subsiteadmin) {
		this.subsiteadmin = subsiteadmin;
	}

	public boolean No2adminLogin(String username,String password){
		List<Subsiteadmin> list = this.subsiteadminDao.findByname(username);
		if(list.size()!=0){//先判断用户存在
			if(password==list.get(0).getPassword()){
				return true;
			}	
		}		
		return false;	
	}
	
	public boolean AddNo2admin(String username,String password,String subsitename,int right){
		int subsiteid = this.subsiteDao.findByname(subsitename).get(0).getId();
		this.subsiteadmin.setUsername(username);
		this.subsiteadmin.setPassword(password);
		this.subsiteadmin.setRight(right);
		this.subsiteadmin.setSubsiteid(subsiteid);
		this.subsiteadminDao.save(subsiteadmin);
		return true;
	}
	
	public boolean DeleteNo2admin(String username){
		this.subsiteadmin.setUsername(username);
		this.subsiteadminDao.delete(subsiteadmin);
		return true;
	}
	
	public List<Subsiteadmin> ShowNo2admin(){
		return this.subsiteadminDao.findAll();
	}
}
