package dao;
import java.util.List;

import beans.Subsite;


public interface SubsiteDAO{

	public void save(Subsite transientInstance);
	public void delete(Subsite persistentInstance);
	public List<Subsite> findByname(String subsitename);
	public List<Subsite> findBysiteid(int siteid);
	
}