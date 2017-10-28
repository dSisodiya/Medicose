package in.co.controller.test;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import in.co.controller.MainController;
import in.co.dto.CatBean;
import in.co.util.HibernateUtil;
import in.co.util.JsonUtil;

import org.hibernate.query.Query;


//@Controller
//@RequestMapping("/TestctlCat")
public class CatController extends MainController {

	@RequestMapping("/read")
	public ModelAndView read() { 
		ModelAndView mv=new ModelAndView("Test2");
		
		CatBean bean = new CatBean("cat5", "catTes6");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		CatBean cbean = (CatBean) o;
		System.out.println(cbean.getCatId() + " , " + cbean.getCatName());
		
		String jsonString=JsonUtil.JavaToJson(o);
		System.out.println(jsonString);
		//mv.addObject("result", jsonString);
		mv.addObject("result", cbean);
		
		mv.addObject("Name", "CatController_read");
		
		return mv;
	}
	@RequestMapping("/readAll")
	public ModelAndView readAll(HttpServletRequest request ,HttpServletResponse response) {
		ModelAndView mv=new ModelAndView("Test2");
		
				// just assgin table name in bean object
		CatBean bean = new CatBean("CatBean", "CatBean");//Assign table Name only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
				
		List<CatBean> list= (List<CatBean>)o;
		
			for(CatBean b:list){
				System.out.println(b.getCatId()+" , "+b.getCatName());
			}
			String jsonString=JsonUtil.JavaToJson(o);
			//System.out.println(jsonString);
			//mv.addObject("result", jsonString);
			
			//response.setContentType("application/json");
			mv.addObject("result", list);
			
			mv.addObject("Name", "CatController_readAll");
			return mv;
		}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping("/Add")
	public static void Add() {

		CatBean bean = new CatBean("cat7", "catTes7");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

@RequestMapping("/update")
	public static void update() {

		CatBean bean = new CatBean("cat7", "catTes7");
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
	public static void delete() {

		CatBean bean = new CatBean("cat7", "catTes7");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}
	
	}
