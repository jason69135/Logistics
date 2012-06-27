package services;

import beans.Customer;

public interface CustomerServices {
	public boolean login(Customer customer);

	public void register(Customer customer);

}
