package beans;

import java.sql.Time;

/**
 * Subnumber entity. @author MyEclipse Persistence Tools
 */

public class Subnumber implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Subsite subsite;
	private Time time;

	// Constructors

	/** default constructor */
	public Subnumber() {
	}

	/** full constructor */
	public Subnumber(Subsite subsite, Time time) {
		this.subsite = subsite;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Subsite getSubsite() {
		return this.subsite;
	}

	public void setSubsite(Subsite subsite) {
		this.subsite = subsite;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}