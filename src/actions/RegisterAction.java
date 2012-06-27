package actions;

import services.CustomerServices;
import beans.Customer;
import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private Customer customer;
	private CustomerServices customerServices;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public void setCustomerServices(CustomerServices customerServices) {
		this.customerServices = customerServices;
	}

	public String execute() {
		this.customerServices.register(this.customer);
		return SUCCESS;
	}
}
