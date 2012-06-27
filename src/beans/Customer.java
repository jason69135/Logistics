package beans;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Subsite subsite;
	private String username;
	private String password;
	private String email;
	private String address;
	private String tel;
	private Float account;
	private Set<?> letterses = new HashSet<Object>(0);
	private Set<?> ordersForCusid = new HashSet<Object>(0);
	private Set<?> ordersForRecieveid = new HashSet<Object>(0);
	private Set<?> receivers = new HashSet<Object>(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** minimal constructor */
	public Customer(Subsite subsite, String username, String password,
			Float account) {
		this.subsite = subsite;
		this.username = username;
		this.password = password;
		this.account = account;
	}

	/** full constructor */
	public Customer(Subsite subsite, String username, String password,
			String email, String address, String tel, Float account,
			Set<?> letterses, Set<?> ordersForCusid, Set<?> ordersForRecieveid,
			Set<?> receivers) {
		this.subsite = subsite;
		this.username = username;
		this.password = password;
		this.email = email;
		this.address = address;
		this.tel = tel;
		this.account = account;
		this.letterses = letterses;
		this.ordersForCusid = ordersForCusid;
		this.ordersForRecieveid = ordersForRecieveid;
		this.receivers = receivers;
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

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return this.tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public Float getAccount() {
		return this.account;
	}

	public void setAccount(Float account) {
		this.account = account;
	}

	public Set<?> getLetterses() {
		return this.letterses;
	}

	public void setLetterses(Set<?> letterses) {
		this.letterses = letterses;
	}

	public Set<?> getOrdersForCusid() {
		return this.ordersForCusid;
	}

	public void setOrdersForCusid(Set<?> ordersForCusid) {
		this.ordersForCusid = ordersForCusid;
	}

	public Set<?> getOrdersForRecieveid() {
		return this.ordersForRecieveid;
	}

	public void setOrdersForRecieveid(Set<?> ordersForRecieveid) {
		this.ordersForRecieveid = ordersForRecieveid;
	}

	public Set<?> getReceivers() {
		return this.receivers;
	}

	public void setReceivers(Set<?> receivers) {
		this.receivers = receivers;
	}

}