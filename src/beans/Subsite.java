package beans;

import java.sql.Time;
import java.util.HashSet;
import java.util.Set;

/**
 * Subsite entity. @author MyEclipse Persistence Tools
 */

public class Subsite implements java.io.Serializable {

	// Fields
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Site site;
	private String sitename;
	private Time arrivetime;
	private Float fee;
	private Set<?> subnumbers = new HashSet<Object>(0);
	private Set<?> customers = new HashSet<Object>(0);
	private Set<?> receivers = new HashSet<Object>(0);

	// Constructors

	/** default constructor */
	public Subsite() {
	}

	/** minimal constructor */
	public Subsite(Site site, String sitename, Time arrivetime, Float fee) {
		this.site = site;
		this.sitename = sitename;
		this.arrivetime = arrivetime;
		this.fee = fee;
	}

	/** full constructor */
	public Subsite(Site site, String sitename, Time arrivetime, Float fee,
			Set<?> subnumbers, Set<?> customers, Set<?> receivers) {
		this.site = site;
		this.sitename = sitename;
		this.arrivetime = arrivetime;
		this.fee = fee;
		this.subnumbers = subnumbers;
		this.customers = customers;
		this.receivers = receivers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
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

	public Set<?> getSubnumbers() {
		return this.subnumbers;
	}

	public void setSubnumbers(Set<?> subnumbers) {
		this.subnumbers = subnumbers;
	}

	public Set<?> getCustomers() {
		return this.customers;
	}

	public void setCustomers(Set<?> customers) {
		this.customers = customers;
	}

	public Set<?> getReceivers() {
		return this.receivers;
	}

	public void setReceivers(Set<?> receivers) {
		this.receivers = receivers;
	}

}