package services.impl;

import java.util.List;

import beans.Customer;
import dao.CustomerDAO;

public class UserServiceImpl implements services.UserService{
	private CustomerDAO customerDao;
	
	
	public CustomerDAO getCustomerDao() {
		return customerDao;
	}


	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}


	public boolean userLogin(String username,String password){
		List<Customer> list = this.customerDao.find(username);
		if(list.size()!=0){//先判断用户存在
			if(password==list.get(0).getPassword()){
				return true;
			}	
		}		
		return false;	
	}
}
