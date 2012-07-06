package services.impl;

import java.util.List;

import dao.CustomerDAO;
import dao.LettersDAO;
import beans.Letters;
import services.MessageService;

public class MessageServiceImpl implements MessageService {
	private LettersDAO lettersDao;
	private CustomerDAO customerDao;

	public CustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}

	public LettersDAO getLettersDao() {
		return lettersDao;
	}

	public void setLettersDao(LettersDAO lettersDao) {
		this.lettersDao = lettersDao;
	}

	public List<Letters> ShowMessage(String username) {
		int userid = this.customerDao.findByName(username).get(0).getId();// 先查询用户id
		List<Letters> list = this.lettersDao.find(userid);
		return list;
	}

	public Letters ShowDetailMessage(int messageid) {
		Letters letter = this.lettersDao.findByid(messageid);
		return letter;
	}

	public boolean DeleteMessage(int messageid) {
		this.lettersDao.delete(this.lettersDao.findByid(messageid));
		return true;
	}

	public int GetunreadMessage(String username) {
		int userid = this.customerDao.findByName(username).get(0).getId();
		List<Letters> list = this.lettersDao.findByUser(userid);
		int unread = 0;
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getState().equals("unread")) {
				unread++;
			}
		}
		return unread;
	}
}