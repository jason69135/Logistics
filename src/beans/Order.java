package beans;

/**
 * Order entity. @author MyEclipse Persistence Tools
 */

public class Order implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private Customer customerByCusid;
	private Customer customerByRecieveid;
	private Float weight;
	private Float vol;
	private Float sprice;
	private Float fee;
	private String remark;
	private Integer status;
	private Integer break_;
	private Integer check;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Customer customerByCusid, Customer customerByRecieveid,
			Float weight, Float vol, Float sprice, Float fee, Integer status) {
		this.customerByCusid = customerByCusid;
		this.customerByRecieveid = customerByRecieveid;
		this.weight = weight;
		this.vol = vol;
		this.sprice = sprice;
		this.fee = fee;
		this.status = status;
	}

	/** full constructor */
	public Order(Customer customerByCusid, Customer customerByRecieveid,
			Float weight, Float vol, Float sprice, Float fee, String remark,
			Integer status, Integer break_, Integer check) {
		this.customerByCusid = customerByCusid;
		this.customerByRecieveid = customerByRecieveid;
		this.weight = weight;
		this.vol = vol;
		this.sprice = sprice;
		this.fee = fee;
		this.remark = remark;
		this.status = status;
		this.break_ = break_;
		this.check = check;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomerByCusid() {
		return this.customerByCusid;
	}

	public void setCustomerByCusid(Customer customerByCusid) {
		this.customerByCusid = customerByCusid;
	}

	public Customer getCustomerByRecieveid() {
		return this.customerByRecieveid;
	}

	public void setCustomerByRecieveid(Customer customerByRecieveid) {
		this.customerByRecieveid = customerByRecieveid;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getVol() {
		return this.vol;
	}

	public void setVol(Float vol) {
		this.vol = vol;
	}

	public Float getSprice() {
		return this.sprice;
	}

	public void setSprice(Float sprice) {
		this.sprice = sprice;
	}

	public Float getFee() {
		return this.fee;
	}

	public void setFee(Float fee) {
		this.fee = fee;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public Integer getStatus() {
		return this.status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getBreak_() {
		return this.break_;
	}

	public void setBreak_(Integer break_) {
		this.break_ = break_;
	}

	public Integer getCheck() {
		return this.check;
	}

	public void setCheck(Integer check) {
		this.check = check;
	}

}