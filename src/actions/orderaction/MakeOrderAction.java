package actions.orderaction;

import services.OrderService;
import services.RecieverService;

import com.opensymphony.xwork2.ActionSupport;

public class MakeOrderAction extends ActionSupport {

	private static final long serialVersionUID = 1L;
	private OrderService orderservice;
	private RecieverService recieverservice;

	private String cusname;
	private int customertel;
	private String cusaddres;
	private String sendsubsitename;
	private String recievesubsitename;
	private String recievername;
	private int recievertel;
	private String goodname;
	private float proprice;
	private float weight;
	private int priority;
	private String remark;

	public String getCusname() {
		return cusname;
	}

	public void setCusname(String cusname) {
		this.cusname = cusname;
	}

	public int getCustomertel() {
		return customertel;
	}

	public void setCustomertel(int customertel) {
		this.customertel = customertel;
	}

	public String getCusaddres() {
		return cusaddres;
	}

	public void setCusaddres(String cusaddres) {
		this.cusaddres = cusaddres;
	}

	public String getSendsubsitename() {
		return sendsubsitename;
	}

	public void setSendsubsitename(String sendsubsitename) {
		this.sendsubsitename = sendsubsitename;
	}

	public String getRecievesubsitename() {
		return recievesubsitename;
	}

	public void setRecievesubsitename(String recievesubsitename) {
		this.recievesubsitename = recievesubsitename;
	}

	public String getRecievername() {
		return recievername;
	}

	public void setRecievername(String recievername) {
		this.recievername = recievername;
	}

	public int getRecievertel() {
		return recievertel;
	}

	public void setRecievertel(int recievertel) {
		this.recievertel = recievertel;
	}

	public String getGoodname() {
		return goodname;
	}

	public void setGoodname(String goodname) {
		this.goodname = goodname;
	}

	public float getProprice() {
		return proprice;
	}

	public void setProprice(float proprice) {
		this.proprice = proprice;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public RecieverService getRecieverservice() {
		return recieverservice;
	}

	public void setRecieverservice(RecieverService recieverservice) {
		this.recieverservice = recieverservice;
	}

	public OrderService getOrderservice() {
		return orderservice;
	}

	public void setOrderservice(OrderService orderservice) {
		this.orderservice = orderservice;
	}

	@Override
	public String execute() {
		// 页面获取
		this.recieverservice.AddReciever(this.recievername, this.recievertel,
				this.recievesubsitename, this.cusname);
		if (this.orderservice.MakeOrder(this.cusname, this.customertel,
				this.cusaddres, this.sendsubsitename, this.recievesubsitename,
				this.recievername, this.recievertel, this.goodname,
				this.proprice, this.weight, this.priority, this.remark)) {
			return SUCCESS;
		}
		return ERROR;
	}
}
