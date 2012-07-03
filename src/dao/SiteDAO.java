package dao;
import java.util.List;

import beans.Site;


public interface SiteDAO{
	
	public void save(Site transientInstance);
	public void delete(Site persistentInstance);
	public List<Site> findByname(String sitename);
	public List<Site> findAll();
}