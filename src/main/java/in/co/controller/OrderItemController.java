package in.co.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.OrderItemBean;
import in.co.util.HibernateUtil;

public class OrderItemController extends MainController {

	// -----------Methods--OrderItemBean.java---------
	@RequestMapping()
	public static void read() {
		OrderItemBean bean = new OrderItemBean("od1", "catTes6","hgh",255,"actt1");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		OrderItemBean b = (OrderItemBean) o;
			try {
				System.out.println(b.getId() + " , " + b.getoId()+", " + b.getPro_id()+" ,"+b.getQuantity()+" ,"+b.getQuantity());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		OrderItemBean bean = new OrderItemBean("OrderItemBean", "OrderItemBean","",22,"");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<OrderItemBean> list= (List<OrderItemBean>)o;
		
		try {
				for(OrderItemBean b:list){
				System.out.println(b.getId() + " , " + b.getoId()+", " + b.getPro_id()+" ,"+b.getQuantity()+" ,"+b.getQuantity());
				}
			} catch (NullPointerException e) {
					System.out.println("No record found,Table is empty");
			}
			
			}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping()
	public static void add() {

		OrderItemBean bean = new OrderItemBean("od1", "catTes6","hgh",255,"actt1");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		OrderItemBean bean = new OrderItemBean("od1", "genNamexxx1","gggg",62200,"hhhh");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		try {
			String strid = (String) obj.operation(bean, UPDATE);
			
		} catch (Exception e) {
			System.out.println("No updation is possible, Please check the userid");
		}
		
	}

	@RequestMapping()
	public static void delete() {

		OrderItemBean bean = new OrderItemBean("od1","dd1","",2500,"hhh");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}
	
	public static void main(String[] args) {
		add();
		//update();
		//read();
		//readAll();
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}
}