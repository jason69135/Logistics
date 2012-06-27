package beans;

/**
 * Claims entity. @author MyEclipse Persistence Tools
 */

public class Claims implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderid;
	private String reason;

	// Constructors

	/** default constructor */
	public Claims() {
	}

	/** full constructor */
	public Claims(Integer orderid, String reason) {
		this.orderid = orderid;
		this.reason = reason;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

}