package beans;

import java.sql.Time;

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
	private Site siteBySitea;
	private Site siteBySiteb;
	private Time time;
	private Float fee;

	// Constructors

	/** default constructor */
	public Sitetosite() {
	}

	/** full constructor */
	public Sitetosite(Site siteBySitea, Site siteBySiteb, Time time, Float fee) {
		this.siteBySitea = siteBySitea;
		this.siteBySiteb = siteBySiteb;
		this.time = time;
		this.fee = fee;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Site getSiteBySitea() {
		return this.siteBySitea;
	}

	public void setSiteBySitea(Site siteBySitea) {
		this.siteBySitea = siteBySitea;
	}

	public Site getSiteBySiteb() {
		return this.siteBySiteb;
	}

	public void setSiteBySiteb(Site siteBySiteb) {
		this.siteBySiteb = siteBySiteb;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

	public Float getFee() {
		return this.fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

}