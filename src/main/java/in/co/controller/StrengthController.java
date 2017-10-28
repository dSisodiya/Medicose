package in.co.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.StrengthBean;
import in.co.util.HibernateUtil;

@Controller
public class StrengthController extends MainController {

	// -----------Methods--StrengthBean.java---------
	@RequestMapping("/read")
	public static void read() {
		StrengthBean bean = new StrengthBean("od1", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		StrengthBean b = (StrengthBean) o;
			try {
				System.out.println(b.getId() + " , " + b.getStrengthName());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping("/readAll")
	public static void readAll() {
// just assgin table name in bean object
		StrengthBean bean = new StrengthBean("StrengthBean", "StrengthBean");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<StrengthBean> list= (List<StrengthBean>)o;
		
		try {
				for(StrengthBean b:list){
				System.out.println(b.getId() + " , " + b.getStrengthName());
				}
			} catch (NullPointerException e) {
					System.out.println("No record found,Table is empty");
			}
			
			}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping("/add")
	public static void add() {

		StrengthBean bean = new StrengthBean("od2","manuName2");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping("/update")
	public static void update() {

		StrengthBean bean = new StrengthBean("od1", "genNamexxx1");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		try {
			String strid = (String) obj.operation(bean, UPDATE);
			
		} catch (Exception e) {
			System.out.println("No updation is possible, Please check the userid");
		}
		
	}

	@RequestMapping("/delete")
	public static void delete() {

		StrengthBean bean = new StrengthBean("od1","dd1");
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