package services.impl;

import beans.Receiver;
import dao.CustomerDAO;
import dao.ReceiverDAO;
import dao.SubsiteDAO;
import services.RecieverService;

public class RecieverServiceImpl implements RecieverService {
	private ReceiverDAO recieverDao;
	private SubsiteDAO subsiteDao;
	private CustomerDAO customerDao;

	public CustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public ReceiverDAO getRecieverDao() {
		return recieverDao;
	}

	public void setRecieverDao(ReceiverDAO recieverDao) {
		this.recieverDao = recieverDao;
	}

	public boolean AddReciever(String username, int tel, String subsitename,
			String cusname) {
		// 获取二级站点
		int subsiteid = this.subsiteDao.findByname(subsitename).get(0).getId();
		// 获取发货人id
		int cusid = this.customerDao.findByName(cusname).get(0).getId();
		Receiver receiver = new Receiver();
		receiver.setUsername(username);
		receiver.setCusid(cusid);
		receiver.setTel(tel);
		receiver.setSubsiteid(subsiteid);
		this.recieverDao.save(receiver);
		return true;
	}
}
