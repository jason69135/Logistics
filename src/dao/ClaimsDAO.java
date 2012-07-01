package dao;
import java.util.List;

import beans.Claims;


public interface ClaimsDAO{


	public void save(Claims transientInstance);

	public void delete(Claims persistentInstance);
			
	public List<Claims> findAll();
}