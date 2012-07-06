package services.impl;

import beans.Claims;
import dao.ClaimsDAO;
import services.ComplainlistService;

public class ComplainlistServiceImpl implements ComplainlistService {
	private ClaimsDAO claimsDao;

	public ClaimsDAO getClaimsDao() {
		return claimsDao;
	}

	public void setClaimsDao(ClaimsDAO claimsDao) {
		this.claimsDao = claimsDao;
	}

	public boolean AddComplain(String orderno, String person, int pay,
			String reason) {
		Claims claim = new Claims();
		claim.setOrderno(orderno);
		claim.setPerson(person);
		claim.setFee(pay);
		claim.setReason(reason);
		System.out.println("sda"+claim.getOrderno());
		this.claimsDao.save(claim);
		return true;
	}

}
