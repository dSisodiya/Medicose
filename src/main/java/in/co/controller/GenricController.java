package in.co.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.co.dto.GenricBean;
import in.co.util.HibernateUtil;

@Controller
@RequestMapping("/ctlGenric")
public class GenricController extends MainController {

	// -----------Methods--GenricBean.java---------
	@RequestMapping("/read")
	public  ModelAndView read() {
		System.out.println("at GenricController in read method");
		ModelAndView mv =new ModelAndView();
		/*GenricBean bean = new GenricBean("gen2", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.addUpdateDelete(bean, READ);
		GenricBean cbean = (GenricBean) o;
			try {
				System.out.println(cbean.getId() + " , " + cbean.getGenric_Name());
			
				} catch (NullPointerException e) {
						System.out.println("No record found for this search");
				}*/
		
	return mv;
	}
	@RequestMapping("readAll")
	public  void readAll() {
// just assgin table name in bean object
		GenricBean bean = new GenricBean("GenricBean", "GenricBean");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<GenricBean> list= (List<GenricBean>)o;
		
		try {
				for(GenricBean b:list){
				System.out.println(b.getId()+" , "+b.getGenric_Name());
				}
			} catch (NullPointerException e) {
					System.out.println("No record found,Table is empty");
			}
			
			}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping("/Add")
	public  void add(@RequestParam("name") String genricName) {

		GenricBean bean = new GenricBean("gen7", genricName);
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping("/update")
	public  void update() {

		GenricBean bean = new GenricBean("gen1", "genNamexxx1");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid;
		try {
			strid = (String) obj.operation(bean, UPDATE);
			
		} catch (Exception e) {
			System.out.println("No updation is possible, Please check the userid");
		}
	}

	@RequestMapping("/delete")
	public  void delete() {

		GenricBean bean = new GenricBean("gen1", "genName1");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}
	
	/*public static void main(String[] args) {
		//add();
		update();
		read();
		readAll();
	}*/
}