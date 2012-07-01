package services;

import beans.Customer;

public interface UserService {
	public boolean userLogin(String username, String password);

	public void userRegister(Customer customer);
	
	public boolean changePassword(Customer customer , String newPassword);
}