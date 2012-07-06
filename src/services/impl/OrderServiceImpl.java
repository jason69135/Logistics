package services.impl;

import java.util.Calendar;
import java.util.List;

import services.OrderService;

import beans.Order;
import dao.CustomerDAO;
import dao.OrderDAO;
import dao.ReceiverDAO;
import dao.RouteDAO;
import dao.SitetositeDAO;
import dao.SubsiteDAO;

public class OrderServiceImpl implements OrderService {
	private OrderDAO orderDao;
	private SubsiteDAO subsiteDao;
	private CustomerDAO customerDao;
	private RouteDAO routeDao;
	private ReceiverDAO receiverDao;
	private SitetositeDAO sitetositeDao;

	public SubsiteDAO getSubsiteDao() {
		return subsiteDao;
	}

	public void setSubsiteDao(SubsiteDAO subsiteDao) {
		this.subsiteDao = subsiteDao;
	}

	public SitetositeDAO getSitetositeDao() {
		return sitetositeDao;
	}

	public void setSitetositeDao(SitetositeDAO sitetositeDao) {
		this.sitetositeDao = sitetositeDao;
	}

	public ReceiverDAO getReceiverDao() {
		return receiverDao;
	}

	public void setReceiverDao(ReceiverDAO receiverDao) {
		this.receiverDao = receiverDao;
	}

	public RouteDAO getRouteDao() {
		return routeDao;
	}

	public void setRouteDao(RouteDAO routeDao) {
		this.routeDao = routeDao;
	}

	public CustomerDAO getCustomerDao() {
		return customerDao;
	}

	public void setCustomerDao(CustomerDAO customerDao) {
		this.customerDao = customerDao;
	}

	public OrderDAO getOrderDao() {
		return orderDao;
	}

	public void setOrderDao(OrderDAO orderDao) {
		this.orderDao = orderDao;
	}

	public boolean MakeOrder(String cusname, int customertel, String cusaddres,
			String sendsubsitename, String recievesubsitename,
			String recievername, int recievertel, String goodname,
			float proprice, float weight, int priority, String remark) {
		// 查发货人id
		int cusid = this.customerDao.findByName(cusname).get(0).getId();// 发货人id
		// 查收货人id
		int recieveid = this.receiverDao.findByName(recievername).get(0)
				.getId();
		// 查起始一 级站点 id和一级站点结束id
		int startid = this.subsiteDao.findByname(sendsubsitename).get(0)
				.getSiteid();
		int finishid = this.subsiteDao.findByname(recievesubsitename).get(0)
				.getSiteid();
		// 查路线id
		int routeid = this.routeDao.findBysiteid(startid, finishid).getId();// 线路id
		// 读出路径中全部点
		String pass = this.routeDao.findBysiteid(startid, finishid).getPass();
		String passsite[] = pass.split(",");
		// 算运费
		float topfee = this.sitetositeDao.findBysite(
				this.subsiteDao.findByname(sendsubsitename).get(0).getSiteid(),
				Integer.parseInt(passsite[0])).get(0).getFee();// 起始点
		float middlefee = 0;
		for (int i = 0; i < passsite.length - 1; i++) {
			middlefee += this.sitetositeDao.findBysite(
					Integer.parseInt(passsite[i]),
					Integer.parseInt(passsite[i + 1])).get(0).getFee();
		}
		float bottomfee = this.sitetositeDao.findBysite(
				Integer.parseInt(passsite[passsite.length - 1]),
				this.subsiteDao.findByname(recievesubsitename).get(0)
						.getSiteid()).get(0).getFee();// 结束点
		float feetotal = middlefee + bottomfee + topfee;
		// 生成订单:W+用户id+时间(年月日)
		Calendar ca = Calendar.getInstance();
		int year = ca.get(Calendar.YEAR);// 获取年
		int month = ca.get(Calendar.MONTH);// 获取月
		int day = ca.get(Calendar.DATE);// 获取日
		int minute = ca.get(Calendar.MINUTE);// 分
		int hour = ca.get(Calendar.HOUR);// 小时
		int second = ca.get(Calendar.SECOND);// 秒
		Order order = new Order();
		String ordernumber = "W" + String.valueOf(cusid) + String.valueOf(year)
				+ String.valueOf(month) + String.valueOf(day)
				+ String.valueOf(hour) + String.valueOf(minute)
				+ String.valueOf(second);
		order.setOrderNo(ordernumber);
		order.setFee(feetotal);
		order.setRouteid(routeid);
		order.setCusid(cusid);
		order.setGoodname(goodname);
		order.setWeight(weight);
		order.setSprice(proprice);
		order.setRemark(remark);
		order.setPriority(priority);
		order.setRecieveid(recieveid);
		order.setBreakstate("未损坏");
		order.setCheckstate("未审核");
		order.setLoststate("未丢失");
		order.setPaystate("未支付");
		order.setPayway("到付");
		order.setStatus("未取货");
		this.orderDao.save(order);
		return true;
	}

	public Order ShowDetailOrder(int orderid) {
		Order order = this.orderDao.findByid(orderid);
		return order;
	}

	public List<Order> ShowOrder(String customername) {
		int customerid = this.customerDao.findByName(customername).get(0)
				.getId();
		List<Order> list = this.orderDao.findBycusid(customerid);
		return list;
	}

	public Order TrackOrder(String orderno) {
		return this.orderDao.findByorderno(orderno);
	}
	
	public List<Order> CheckOrder(String username){
		int userid = this.customerDao.findByName(username).get(0).getId();
		List<Order> list =  this.orderDao.findBycusid(userid);
		return list;
	}
	
	public Order SearchOrder(String orderno){
		return this.orderDao.findByorderno(orderno);
	}
	
	public List<Order> ShowAllOrder(){
		List<Order>  list = this.orderDao.findByall();
		return list;
	}
	
	public List<Order> Findbyrouteid(int routeid){
		return this.orderDao.findByrouteid(routeid);
	}
	
	public boolean UpdateOrder(Order order){
		this.orderDao.update(order);
		return true;
	}
}
