package dao;
import java.util.List;

import beans.Validate;

public interface ValidateDAO{

	public void save(Validate transientInstance);
	public void delete(Validate persistentInstance);
	public List<Validate> findAll();
}