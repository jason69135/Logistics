package beans;

/**
 * Sitetosite entity. @author MyEclipse Persistence Tools
 */

public class Sitetosite implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer sitea;
	private Integer siteb;
	private Integer fee;

	// Constructors

	/** default constructor */
	public Sitetosite() {
	}

	/** minimal constructor */
	public Sitetosite(Integer id, Integer sitea, Integer siteb) {
		this.id = id;
		this.sitea = sitea;
		this.siteb = siteb;
	}

	/** full constructor */
	public Sitetosite(Integer id, Integer sitea, Integer siteb, Integer fee) {
		this.id = id;
		this.sitea = sitea;
		this.siteb = siteb;
		this.fee = fee;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSitea() {
		return this.sitea;
	}

	public void setSitea(Integer sitea) {
		this.sitea = sitea;
	}

	public Integer getSiteb() {
		return this.siteb;
	}

	public void setSiteb(Integer siteb) {
		this.siteb = siteb;
	}

	public Integer getFee() {
		return this.fee;
	}

	public void setFee(Integer fee) {
		this.fee = fee;
	}

}