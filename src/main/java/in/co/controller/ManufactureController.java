package in.co.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.ManufactureBean;
import in.co.util.HibernateUtil;

public class ManufactureController extends MainController {

	// -----------Methods--ManufactureBean.java---------
	@RequestMapping()
	public static void read() {
		ManufactureBean bean = new ManufactureBean("gen2", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		ManufactureBean b = (ManufactureBean) o;
			try {
				System.out.println(b.getId() + " , " + b.getManu_name());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		ManufactureBean bean = new ManufactureBean("ManufactureBean", "ManufactureBean");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<ManufactureBean> list= (List<ManufactureBean>)o;
		
		try {
				for(ManufactureBean b:list){
				System.out.println(b.getId()+" , "+b.getManu_name());
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

		ManufactureBean bean = new ManufactureBean("manu5","manuName5");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		ManufactureBean bean = new ManufactureBean("gen1", "genNamexxx1");
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

		ManufactureBean bean = new ManufactureBean("gen1", "genName1");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}
	
	public static void main(String[] args) {
		add();
		update();
		read();
		readAll();
	}
}
