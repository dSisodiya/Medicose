package in.co.controller.test;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.OrderBean;
import in.co.util.HibernateUtil;

public class OrderController extends MainController {

	// -----------Methods--OrderBean.java---------
	@RequestMapping()
	public static void read() {
		OrderBean bean = new OrderBean("od1", "catTes6",255);
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		OrderBean b = (OrderBean) o;
			try {
				System.out.println(b.getId() + " , " + b.getoDate()+" ,"+b.getoTotal());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		OrderBean bean = new OrderBean("OrderBean", "OrderBean",22);//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<OrderBean> list= (List<OrderBean>)o;
		
		try {
				for(OrderBean b:list){
				System.out.println(b.getId() + " , " + b.getoDate()+" ,"+b.getoTotal());
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

		OrderBean bean = new OrderBean("od2","manuName2",23333);
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		OrderBean bean = new OrderBean("od1", "genNamexxx1",62200);
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

		OrderBean bean = new OrderBean("od1","dd1",2500);
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
