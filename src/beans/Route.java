package beans;

/**
 * Route entity. @author MyEclipse Persistence Tools
 */

public class Route implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer siteid;
	private String pass;

	// Constructors

	/** default constructor */
	public Route() {
	}

	/** full constructor */
	public Route(Integer siteid, String pass) {
		this.siteid = siteid;
		this.pass = pass;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}