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
	private Integer fee;
	private String reason;
	private String person;

	// Constructors

	/** default constructor */
	public Claims() {
	}

	/** minimal constructor */
	public Claims(Integer id, Integer orderid, String reason) {
		this.id = id;
		this.orderid = orderid;
		this.reason = reason;
	}

	/** full constructor */
	public Claims(Integer id, Integer orderid, Integer fee, String reason,
			String person) {
		this.id = id;
		this.orderid = orderid;
		this.fee = fee;
		this.reason = reason;
		this.person = person;
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

	public Integer getFee() {
		return this.fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

	public String getReason() {
		return this.reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getPerson() {
		return this.person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

}