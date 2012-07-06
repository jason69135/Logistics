package services;

import java.util.List;

import beans.Siteadmin;

public interface No1AdminService {
	public boolean No1adminLogin(String username,String password);
	public boolean AddNo1admin(String username,String password,String sitename,int right);
	public boolean DeleteNo1admin(String username);

	public List<Siteadmin> ShowNo1admin();
	
	public Siteadmin ShowNo1admininfo(String adminname);
}
