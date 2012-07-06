package services.impl;

import java.util.List;

import dao.WaitlistDAO;

import beans.Waitlist;
import services.WaitlistService;

public class WaitlistServiceImpl implements WaitlistService {
	private WaitlistDAO waitlistDao;

	public WaitlistDAO getWaitlistDao() {
		return waitlistDao;
	}

	public void setWaitlistDao(WaitlistDAO waitlistDao) {
		this.waitlistDao = waitlistDao;
	}

	public List<Waitlist> ShowWaitlist() {
		return this.waitlistDao.findAll();
	}

	public boolean AddWaitlist(int siteid, String orderno, int priority,
			int numberid) {
		Waitlist waitlist = new Waitlist();
		waitlist.setNumberid(numberid);
		waitlist.setOrderno(orderno);
		waitlist.setPriority(priority);
		waitlist.setSiteid(siteid);
		this.waitlistDao.save(waitlist);
		
		return true;
	}
}
