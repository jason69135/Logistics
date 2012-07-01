package beans;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String password;
	private String email;
	private String address;
	private String tel;
	private Integer subsiteid;

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Integer id, String username, String password,
			Integer subsiteid) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.subsiteid = subsiteid;
	}

	/** full constructor */
	public Customer(Integer id, String username, String password, String email,
			String address, String tel, Integer subsiteid) {
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.tel = tel;
		this.subsiteid = subsiteid;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Integer getSubsiteid() {
		return this.subsiteid;
	}

	public void setSubsiteid(Integer subsiteid) {
		this.subsiteid = subsiteid;
	}

}