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
	private String orderno;
	private Integer numberid;
	private Integer siteid;
	private Integer priority;

	// Constructors

	public Integer getPriority() {
		return priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	/** default constructor */
	public Waitlist() {
	}

	/** full constructor */
	public Waitlist(String orderno, Integer numberid, Integer siteid) {
		this.orderno = orderno;
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

	public String getOrderno() {
		return this.orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
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