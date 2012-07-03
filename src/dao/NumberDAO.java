package dao;

import java.util.List;
import beans.Number;

public interface NumberDAO {

	public void save(Number transientInstance);

	public void delete(Number persistentInstance);

	public List<Number> findById(int routeid);

	public List<Number> findAll();
}