package in.co.controller.test;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.USBrandBean;
import in.co.util.HibernateUtil;

public class USBrandController extends MainController {

	// -----------Methods--USBrandBean.java---------
	@RequestMapping()
	public static void read() {
		USBrandBean bean = new USBrandBean("od1", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		USBrandBean b = (USBrandBean) o;
			try {
				System.out.println(b.getId() + " , " + b.getUSB_name());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		USBrandBean bean = new USBrandBean("USBrandBean", "USBrandBean");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<USBrandBean> list= (List<USBrandBean>)o;
		
		try {
				for(USBrandBean b:list){
				System.out.println(b.getId() + " , " + b.getUSB_name());
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

		USBrandBean bean = new USBrandBean("od2","manuName2");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		USBrandBean bean = new USBrandBean("od1", "genNamexxx1");
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

		USBrandBean bean = new USBrandBean("od1","dd1");
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