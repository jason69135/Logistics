package beans;

/**
 * Receiver entity. @author MyEclipse Persistence Tools
 */

public class Receiver implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Subsite subsite;
	private Customer customer;
	private String username;
	private String tel;

	// Constructors

	/** default constructor */
	public Receiver() {
	}

	/** full constructor */
	public Receiver(Subsite subsite, Customer customer, String username,
			String tel) {
		this.subsite = subsite;
		this.customer = customer;
		this.username = username;
		this.tel = tel;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Subsite getSubsite() {
		return this.subsite;
	}

	public void setSubsite(Subsite subsite) {
		this.subsite = subsite;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

}