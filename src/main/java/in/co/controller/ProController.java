package in.co.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.ProBean;
import in.co.util.HibernateUtil;

//@Controller
public class ProController extends MainController {

	// -----------Methods--ProBean.java---------
	@RequestMapping()
	public static void read() {
		ProBean bean = new ProBean("od1", "x","x", "x","x", "x","x", "x","x");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		ProBean b = (ProBean) o;
			try {
				System.out.println(b.getId() + " , "+ b.getP_id() + " , " + b.getPackage_id() + " , " + 
			b.getStrengthId() + " , " + b.getPrice()+", "+b.getSt_available()+ " , " + b.getSt_consume() +
					" , " + b.getPro_isActive());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		ProBean bean = new ProBean("ProBean", "ProBean", "x","x", "x", "x","x", "x","x");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<ProBean> list= (List<ProBean>)o;
		
		try {
				for(ProBean b:list){
				System.out.println(b.getId() + " , "+ b.getP_id() + " , " + b.getPackage_id() + " , " + 
						b.getStrengthId() + " , " + b.getPrice()+", "+b.getSt_available()+ " , " + b.getSt_consume() +
						" , " + b.getPro_isActive());
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

		ProBean bean = new ProBean("Pro3", "Proqq3", "Proww3","ee3", "rr3", "tt3","yy3", "xuu3","iix3");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		ProBean bean = new ProBean("Pro1", "ProBean1", "x1","x1", "x1", "x1","x1", "x1","x1");
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

		ProBean bean = new ProBean("od1","x", "x", "x","x", "x","x", "x","x");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}
	
	public static void main(String[] args) {
		add();
		//update();
		read();
		readAll();
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
	}
}
