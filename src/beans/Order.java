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
	private String orderNo;
	private String goodname;
	private Float weight;
	private Float sprice;
	private Float fee;
	private String remark;
	private Integer cusid;
	private Integer priority;
	private Integer routeid;
	private Integer recieveid;
	private String payway;
	private String paystate;
	private String checkstate;
	private String breakstate;
	private String status;
	private String loststate;

	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Integer id, Float weight, Float sprice, Float fee,
			Integer cusid, Integer recieveid, String status) {
		this.id = id;
		this.weight = weight;
		this.sprice = sprice;
		this.fee = fee;
		this.cusid = cusid;
		this.recieveid = recieveid;
		this.status = status;
	}

	/** full constructor */
	public Order(Integer id, String orderNo, String goodname, Float weight,
			Float sprice, Float fee, String remark, Integer cusid,
			Integer priority, Integer routeid, Integer recieveid,
			String payway, String paystate, String checkstate,
			String breakstate, String status, String loststate) {
		this.id = id;
		this.orderNo = orderNo;
		this.goodname = goodname;
		this.weight = weight;
		this.sprice = sprice;
		this.fee = fee;
		this.remark = remark;
		this.cusid = cusid;
		this.priority = priority;
		this.routeid = routeid;
		this.recieveid = recieveid;
		this.payway = payway;
		this.paystate = paystate;
		this.checkstate = checkstate;
		this.breakstate = breakstate;
		this.status = status;
		this.loststate = loststate;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getGoodname() {
		return this.goodname;
	}

	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}

	public Float getWeight() {
		return this.weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
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

	public Integer getCusid() {
		return this.cusid;
	}

	public void setCusid(Integer cusid) {
		this.cusid = cusid;
	}

	public Integer getPriority() {
		return this.priority;
	}

	public void setPriority(Integer priority) {
		this.priority = priority;
	}

	public Integer getRouteid() {
		return this.routeid;
	}

	public void setRouteid(Integer routeid) {
		this.routeid = routeid;
	}

	public Integer getRecieveid() {
		return this.recieveid;
	}

	public void setRecieveid(Integer recieveid) {
		this.recieveid = recieveid;
	}

	public String getPayway() {
		return this.payway;
	}

	public void setPayway(String payway) {
		this.payway = payway;
	}

	public String getPaystate() {
		return this.paystate;
	}

	public void setPaystate(String paystate) {
		this.paystate = paystate;
	}

	public String getCheckstate() {
		return this.checkstate;
	}

	public void setCheckstate(String checkstate) {
		this.checkstate = checkstate;
	}

	public String getBreakstate() {
		return this.breakstate;
	}

	public void setBreakstate(String breakstate) {
		this.breakstate = breakstate;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getLoststate() {
		return this.loststate;
	}

	public void setLoststate(String loststate) {
		this.loststate = loststate;
	}

}