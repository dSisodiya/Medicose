package in.co.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import in.co.dao.CatDao;
import in.co.dto.CatBean;
import in.co.dto.GenricBean;
import in.co.dto.USBrandBean;
import in.co.page.CatPage;
import in.co.page.GenricPage;
import in.co.page.USBrandPage;
import in.co.service.CatService;
import in.co.serviceImpl.CatServiceImpl;
import in.co.util.HibernateUtil;

@Controller
@RequestMapping("/ctl")
public class PageController extends MainController {

	@Autowired
	public CatService service;
	//public CatService service=new CatServiceImpl();
	
	// @GetMapping(headers="Accept=application/json")
	// @GetMapping({"/index","/home"})
	@RequestMapping(value = { "/", "/index", "/home" }, method = RequestMethod.GET)
	public ModelAndView index() {
		
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Home");
		mv.addObject("userClickHome", true);
		mv.addObject(new GenricPage());//
		mv.addObject(new USBrandPage());
		mv.addObject(new CatPage());
		//Test code
		CatBean bean=new CatBean("t103", "TestAdd3");
		service.add(bean);
		//service.list();
		//service.findByName("Pain Relief Muscle Relaxant");
		return mv;
	}

	@RequestMapping("/genric")
	public ModelAndView genric() {
		ModelAndView mv = new ModelAndView("page");
		mv.addObject("title", "Genric");
		mv.addObject("userClickGenric", true);
		return mv;
	}

	//@ModelAttribute("countryList")
	public Map<String, String> getCountryList() {
		Map<String, String> countryList = new HashMap<String, String>();
		countryList.put("US", "United States");
		countryList.put("CH", "China");
		countryList.put("SG", "Singapore");
		countryList.put("MY", "Malaysia");
		
		
		return countryList;
	}

	//@ModelAttribute("genricList")
	public List<GenricBean> getGenricList() {
		/*
		 * Assign table Nameonly(bean/DTO name) in constructor, trick for read
		 * all values
		 */
		GenricBean bean = new GenricBean("GenricBean", "GenricBean");

		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
		ArrayList<GenricBean> genricList = (ArrayList<GenricBean>) o;

		for (GenricBean b : genricList) {
			// System.out.println(b.getgenr) + " , " + b.getCatName());
			System.out.println(b.getGenric_id() + " , " + b.getGenric_Name());
		}

		return genricList;
	}

	//@ModelAttribute("catList")
	public List<CatBean> getCatList() {
		/*
		 * Assign table Nameonly(bean/DTO name) in constructor, trick for read
		 * all values
		 */
		CatBean bean = new CatBean("CatBean", "CatBean");

		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
		ArrayList<CatBean> searchList = (ArrayList<CatBean>) o;

		for (CatBean b : searchList) {
			// System.out.println(b.getgenr) + " , " + b.getCatName());
			System.out.println(b.getCatId() + " , " + b.getCatName());
		}

		return searchList;
	}
	//@ModelAttribute("USBList")
	public List<USBrandBean> getUSBList() {
		/*
		 * Assign table Nameonly(bean/DTO name) in constructor, trick for read
		 * all values
		 */
		USBrandBean bean = new USBrandBean("USBrandBean", "USBrandBean");

		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);
		ArrayList<USBrandBean> searchList = (ArrayList<USBrandBean>) o;

		for (USBrandBean b : searchList) {
			// System.out.println(b.getgenr) + " , " + b.getCatName());
			System.out.println(b.getUSB_id() + " , " + b.getUSB_name());
		}

		return searchList;
	}

}
