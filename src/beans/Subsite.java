package beans;

import java.sql.Time;

/**
 * Subsite entity. @author MyEclipse Persistence Tools
 */

public class Subsite implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String sitename;
	private Time arrivetime;
	private Float fee;
	private Integer siteid;

	// Constructors

	/** default constructor */
	public Subsite() {
	}

	/** full constructor */
	public Subsite(Integer id, String sitename, Time arrivetime, Float fee,
			Integer siteid) {
		this.id = id;
		this.sitename = sitename;
		this.arrivetime = arrivetime;
		this.fee = fee;
		this.siteid = siteid;
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

	public Time getArrivetime() {
		return this.arrivetime;
	}

	public void setArrivetime(Time arrivetime) {
		this.arrivetime = arrivetime;
	}

	public Float getFee() {
		return this.fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	public Integer getSiteid() {
		return this.siteid;
	}

	public void setSiteid(Integer siteid) {
		this.siteid = siteid;
	}

}