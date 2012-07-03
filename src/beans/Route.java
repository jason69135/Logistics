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
	private Integer startsiteid;
	private Integer finishsiteid;
	private String pass;

	public Integer getStartsiteid() {
		return startsiteid;
	}

	public void setStartsiteid(Integer startsiteid) {
		this.startsiteid = startsiteid;
	}

	public Integer getFinishsiteid() {
		return finishsiteid;
	}

	public void setFinishsiteid(Integer finishsiteid) {
		this.finishsiteid = finishsiteid;
	}

	// Constructors

	/** default constructor */
	public Route() {
	}

	/** full constructor */
	public Route(Integer startsiteid, Integer finishsiteid, String pass) {
		this.startsiteid = startsiteid;
		this.finishsiteid = finishsiteid;
		this.pass = pass;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPass() {
		return this.pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

}