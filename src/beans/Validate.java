package beans;

/**
 * Validate entity. @author MyEclipse Persistence Tools
 */

public class Validate implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderid;
	private Integer numberid;

	// Constructors

	/** default constructor */
	public Validate() {
	}

	/** full constructor */
	public Validate(Integer orderid, Integer numberid) {
		this.orderid = orderid;
		this.numberid = numberid;
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

	public Integer getNumberid() {
		return this.numberid;
	}

	public void setNumberid(Integer numberid) {
		this.numberid = numberid;
	}

}