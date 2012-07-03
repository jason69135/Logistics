package dao;

import java.util.List;

import beans.Letters;

public interface LettersDAO {

	public void save(Letters transientInstance);

	public void delete(Letters persistentInstance);

	public List<Letters> find(int userid);

	public List<Letters> findByUser(int userid);

	public Letters findByid(int messageid);

	public Letters update(int messageid);
}