package beans;

/**
 * Waitlist entity. @author MyEclipse Persistence Tools
 */

public class Waitlist implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer orderid;
	private Integer numberid;
	private Integer siteid;

	// Constructors

	/** default constructor */
	public Waitlist() {
	}

	/** full constructor */
	public Waitlist(Integer orderid, Integer numberid, Integer siteid) {
		this.orderid = orderid;
		this.numberid = numberid;
		this.siteid = siteid;
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

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

}