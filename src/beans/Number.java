package beans;

import java.sql.Time;

/**
 * Number entity. @author MyEclipse Persistence Tools
 */

public class Number implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer routeid;
	private Time starttime;
	private Integer size;

	// Constructors

	/** default constructor */
	public Number() {
	}

	/** full constructor */
	public Number(Integer routeid, Time starttime, Integer size) {
		this.routeid = routeid;
		this.starttime = starttime;
		this.size = size;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getRouteid() {
		return this.routeid;
	}

	public void setRouteid(Integer routeid) {
		this.routeid = routeid;
	}

	public Time getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Time starttime) {
		this.starttime = starttime;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

}