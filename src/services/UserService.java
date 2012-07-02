package services;

import beans.Customer;

public interface UserService {
	public boolean userLogin(String username, String password);

	public void userRegister(Customer customer);

	public boolean changePassword(Customer customer, String newPassword);

	public boolean changeEmail(Customer customer, String newEmail);

	public Customer searchUser(Customer customer);

}