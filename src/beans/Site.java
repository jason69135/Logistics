package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Site entity. @author MyEclipse Persistence Tools
 */

public class Site implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String sitename;
	private Set<?> sitetositesForSiteb = new HashSet<Object>(0);
	private Set<?> sitetositesForSitea = new HashSet<Object>(0);
	private Set<?> subsites = new HashSet<Object>(0);

	// Constructors

	/** default constructor */
	public Site() {
	}

	/** full constructor */
	public Site(String sitename, Set<?> sitetositesForSiteb,
			Set<?> sitetositesForSitea, Set<?> subsites) {
		this.sitename = sitename;
		this.sitetositesForSiteb = sitetositesForSiteb;
		this.sitetositesForSitea = sitetositesForSitea;
		this.subsites = subsites;
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

	public Set<?> getSitetositesForSiteb() {
		return this.sitetositesForSiteb;
	}

	public void setSitetositesForSiteb(Set<?> sitetositesForSiteb) {
		this.sitetositesForSiteb = sitetositesForSiteb;
	}

	public Set<?> getSitetositesForSitea() {
		return this.sitetositesForSitea;
	}

	public void setSitetositesForSitea(Set<?> sitetositesForSitea) {
		this.sitetositesForSitea = sitetositesForSitea;
	}

	public Set<?> getSubsites() {
		return this.subsites;
	}

	public void setSubsites(Set<?> subsites) {
		this.subsites = subsites;
	}

}