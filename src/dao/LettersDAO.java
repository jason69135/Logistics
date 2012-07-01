package dao;
import java.util.List;

import beans.Letters;

public interface LettersDAO{

	public void save(Letters transientInstance);
	public void delete(Letters persistentInstance);
		

	public List<Letters> findAll();
}