package dao;
import java.util.List;

import beans.Waitlist;


public interface WaitlistDAO{

	public void save(Waitlist transientInstance);
	public void delete(Waitlist persistentInstance);
	public List<Waitlist> findAll();
}