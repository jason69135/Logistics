package services;

import java.util.List;

import beans.Order;

public interface OrderService {
	public boolean MakeOrder(String cusname, int customertel, String cusaddres,
			String sendsubsitename, String recievesubsitename,
			String recievername, int recievertel, String goodname,
			float proprice, float weight, int priority, String remark);

	public Order ShowDetailOrder(int orderid);

	public List<Order> ShowOrder(String customername);

	public Order TrackOrder(String orderno);

	public List<Order> CheckOrder(String username);

	public Order SearchOrder(String orderno);

	public List<Order> ShowAllOrder();

	public List<Order> Findbyrouteid(int routeid);
	
	public boolean UpdateOrder(Order order);
}
