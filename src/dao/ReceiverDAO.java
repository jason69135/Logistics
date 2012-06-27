package dao;

import java.util.List;

import beans.Receiver;

/**
 * A data access object (DAO) providing persistence and search support for
 * Receiver entities. Transaction control of the save(), update() and delete()
 * operations can directly support Spring container-managed transactions or they
 * can be augmented to handle user-managed Spring transactions. Each of these
 * methods provides additional information for how to configure it for the
 * desired type of transaction control.
 * 
 * @see daoNew.Receiver
 * @author MyEclipse Persistence Tools
 */

public interface ReceiverDAO {

	public void save(Receiver transientInstance);

	public void delete(Receiver persistentInstance);

	public Receiver findById(java.lang.Integer id);

	public List<Receiver> findByProperty(String propertyName, Object value);

	public List<Receiver> findAll();

}