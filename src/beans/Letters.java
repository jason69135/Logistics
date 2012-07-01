package beans;

import java.sql.Time;

/**
 * Letters entity. @author MyEclipse Persistence Tools
 */

public class Letters implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Integer userid;
	private String from;
	private String content;
	private String state;
	private Time time;

	// Constructors

	/** default constructor */
	public Letters() {
	}

	/** minimal constructor */
	public Letters(Integer id, Integer userid) {
		this.id = id;
		this.userid = userid;
	}

	/** full constructor */
	public Letters(Integer id, Integer userid, String from, String content,
			String state, Time time) {
		this.id = id;
		this.userid = userid;
		this.from = from;
		this.content = content;
		this.state = state;
		this.time = time;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserid() {
		return this.userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
	}

	public String getFrom() {
		return this.from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Time getTime() {
		return this.time;
	}

	public void setTime(Time time) {
		this.time = time;
	}

}