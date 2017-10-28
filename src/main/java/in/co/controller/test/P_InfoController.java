package in.co.controller.test;

import java.time.LocalDate;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.P_InfoBean;
import in.co.util.HibernateUtil;

public class P_InfoController extends MainController {

	// -----------Methods--P_InfoBean.java---------
	@RequestMapping()
	public static void read() {
		P_InfoBean bean = new P_InfoBean("od1","dd1","ggg","hhh","kkk","jjjj","kkk","yes");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		P_InfoBean b = (P_InfoBean) o;
			try {
//String p_id+ " , 
System.out.println(b.getId() + " , " + b.getP_name()+ " , " + b.getP_genricId()+ " , " +
b.getP_catId()+ " , " + b.getP_USBId()+ " , " + b.getP_manuId()+ " , " +b.getP_packId()+ 
		" , " + b.getP_isActive());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}
		}
	@RequestMapping()
	public static void readAll() {
// just assgin table name in bean object
		P_InfoBean bean = new P_InfoBean("P_InfoBean", "P_InfoBean","od1","dd1","ggg","hhh","kkk","jjjj");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<P_InfoBean> list= (List<P_InfoBean>)o;
		
		try {
				for(P_InfoBean b:list){
				System.out.println(b.getId() + " , " + b.getP_name()+ " , " + b.getP_genricId()+ " , " +
						b.getP_catId()+ " , " + b.getP_USBId()+ " , " + b.getP_manuId()+ " , " +b.getP_packId()+ 
						" , " + b.getP_isActive());
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

		P_InfoBean bean = new P_InfoBean("od1","dxd1","ggg","hhh","kkk","jjjj","kkk","yes");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		P_InfoBean bean = new P_InfoBean("od1","dd1","ggg","hhh","kkk","jjjj","kkk","yes");
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

		P_InfoBean bean = new P_InfoBean("od1","dd1","ggg","hhh","kkk","jjjj","kkk","yes");
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
