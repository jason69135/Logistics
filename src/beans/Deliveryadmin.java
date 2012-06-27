package beans;

/**
 * Deliveryadmin entity. @author MyEclipse Persistence Tools
 */

public class Deliveryadmin implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private Integer right;

	// Constructors

	/** default constructor */
	public Deliveryadmin() {
	}

	/** full constructor */
	public Deliveryadmin(String username, String password, Integer right) {
		this.username = username;
		this.password = password;
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

	public Integer getRight() {
		return this.right;
	}

	public void setRight(Integer right) {
		this.right = right;
	}

}