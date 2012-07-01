package beans;

/**
 * Subsiteadmin entity. @author MyEclipse Persistence Tools
 */

public class Subsiteadmin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private Integer subsiteid;
	private Integer right;

	// Constructors

	/** default constructor */
	public Subsiteadmin() {
	}

	/** full constructor */
	public Subsiteadmin(String username, String password, Integer subsiteid,
			Integer right) {
		this.username = username;
		this.password = password;
		this.subsiteid = subsiteid;
		this.right = right;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getSubsiteid() {
		return this.subsiteid;
	}

	public void setSubsiteid(Integer subsiteid) {
		this.subsiteid = subsiteid;
	}

	public Integer getRight() {
		return this.right;
	}

	public void setRight(Integer right) {
		this.right = right;
	}

}