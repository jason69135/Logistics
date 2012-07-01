package beans;

/**
 * Siteadmin entity. @author MyEclipse Persistence Tools
 */

public class Siteadmin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private Integer siteid;
	private Integer right;

	// Constructors

	/** default constructor */
	public Siteadmin() {
	}

	/** full constructor */
	public Siteadmin(String username, String password, Integer siteid,
			Integer right) {
		this.username = username;
		this.password = password;
		this.siteid = siteid;
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

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

	public Integer getRight() {
		return this.right;
	}

	public void setRight(Integer right) {
		this.right = right;
	}

}