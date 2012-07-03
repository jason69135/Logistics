package dao;

import beans.Claims;

public interface ClaimsDAO {

	public void save(Claims transientInstance);

	public void delete(Claims persistentInstance);
}