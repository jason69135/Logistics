package dao;
import java.util.List;

import beans.Sitetosite;

public interface SitetositeDAO{

	public void save(Sitetosite transientInstance);
	public void delete(Sitetosite persistentInstance);
	
	public List<Sitetosite> findAll();
}