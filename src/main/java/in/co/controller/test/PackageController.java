package in.co.controller.test;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.PackageBeans;
import in.co.util.HibernateUtil;

public class PackageController extends MainController {

	// -----------Methods--PackageBeans.java---------
	@RequestMapping()
	public static void read() {
		PackageBeans bean = new PackageBeans("od1", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		PackageBeans b = (PackageBeans) o;
			try {
				System.out.println(b.getId() + " , " + b.getPackage_name());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		PackageBeans bean = new PackageBeans("PackageBeans", "PackageBeans");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<PackageBeans> list= (List<PackageBeans>)o;
		
		try {
				for(PackageBeans b:list){
				System.out.println(b.getId() + " , " + b.getPackage_name());
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

		PackageBeans bean = new PackageBeans("od2","manuName2");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		PackageBeans bean = new PackageBeans("od1", "genNamexxx1" );
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

		PackageBeans bean = new PackageBeans("od1","dd1");
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