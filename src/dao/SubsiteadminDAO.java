package dao;

import java.util.List;

import beans.Subsiteadmin;

public interface SubsiteadminDAO {

	public void save(Subsiteadmin transientInstance);

	public void delete(Subsiteadmin persistentInstance);

	public List<Subsiteadmin> findByname(String username);
	
	public List<Subsiteadmin> findAll();

}