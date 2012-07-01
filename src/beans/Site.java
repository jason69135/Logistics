package beans;

/**
 * SiteId entity. @author MyEclipse Persistence Tools
 */

public class Site implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String sitename;

	// Constructors

	/** default constructor */
	public Site() {
	}

	/** minimal constructor */
	public Site(Integer id) {
		this.id = id;
	}

	/** full constructor */
	public Site(Integer id, String sitename) {
		this.id = id;
		this.sitename = sitename;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getSitename() {
		return this.sitename;
	}

	public void setSitename(String sitename) {
		this.sitename = sitename;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof Site))
			return false;
		Site castOther = (Site) other;

		return ((this.getId() == castOther.getId()) || (this.getId() != null
				&& castOther.getId() != null && this.getId().equals(
				castOther.getId())))
				&& ((this.getSitename() == castOther.getSitename()) || (this
						.getSitename() != null
						&& castOther.getSitename() != null && this
						.getSitename().equals(castOther.getSitename())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getId() == null ? 0 : this.getId().hashCode());
		result = 37 * result
				+ (getSitename() == null ? 0 : this.getSitename().hashCode());
		return result;
	}

}