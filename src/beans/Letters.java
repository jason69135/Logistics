package beans;

/**
 * Letters entity. @author MyEclipse Persistence Tools
 */

public class Letters implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Customer customer;
	private String content;

	// Constructors

	/** default constructor */
	public Letters() {
	}

	/** minimal constructor */
	public Letters(Customer customer) {
		this.customer = customer;
	}

	/** full constructor */
	public Letters(Customer customer, String content) {
		this.customer = customer;
		this.content = content;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

}