package dao;
import java.util.List;

import beans.Receiver;

public interface ReceiverDAO{

	public void save(Receiver transientInstance);

	public void delete(Receiver persistentInstance);
	
	public List<Receiver> findAll();

}