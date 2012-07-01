package beans;

/**
 * Receiver entity. @author MyEclipse Persistence Tools
 */

public class Receiver implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String tel;
	private Integer subsiteid;
	private Integer cusid;

	// Constructors

	/** default constructor */
	public Receiver() {
	}

	/** full constructor */
	public Receiver(Integer id, String username, String tel, Integer subsiteid,
			Integer cusid) {
		this.id = id;
		this.username = username;
		this.tel = tel;
		this.subsiteid = subsiteid;
		this.cusid = cusid;
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

	public Integer getCusid() {
		return this.cusid;
	}

	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

}