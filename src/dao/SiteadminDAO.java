package dao;
import java.util.List;

import beans.Siteadmin;


public interface SiteadminDAO{
	
	public void save(Siteadmin transientInstance);

	public void delete(Siteadmin persistentInstance);

	public List<Siteadmin> findAll();

}