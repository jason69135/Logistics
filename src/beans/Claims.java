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
	private String orderno;
	private Integer fee;
	private String reason;
	private String person;

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
	}

	// Constructors

	/** default constructor */
	public Claims() {
	}

	/** minimal constructor */
	public Claims(Integer id, String orderno, String reason) {
		this.id = id;
		this.orderno = orderno;
		this.reason = reason;
	}

	/** full constructor */
	public Claims(Integer id, String orderno, Integer fee, String reason,
			String person) {
		this.id = id;
		this.orderno = orderno;
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