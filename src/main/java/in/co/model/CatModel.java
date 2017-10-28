package in.co.model;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.CatBean;
import in.co.util.HibernateUtil;

//@Controller
public class CatModel implements Model{


@RequestMapping()
public static void read() {

	CatBean bean = new CatBean("cat5", "catTes6");
	HibernateUtil obj = new HibernateUtil();
	Object o = obj.operation(bean, READ);
	CatBean cbean = (CatBean) o;
	System.out.println(cbean.getCatId() + " , " + cbean.getCatName());
}
@RequestMapping()
public static void readAll() {
//just assgin table name in bean object
	CatBean bean = new CatBean("CatBean", "CatBean");//Assign table Name only,trick
	HibernateUtil obj = new HibernateUtil();
	Object o = obj.operation(bean, READ_ALL);
			
	List<CatBean> list= (List<CatBean>)o;
	
		for(CatBean b:list){
			System.out.println(b.getCatId()+" , "+b.getCatName());
		}
		}

/**
 * ----------Add, Update, Delete-----------
 */
@RequestMapping()
public static void Add() {

	CatBean bean = new CatBean("cat7", "catTes7");
	HibernateUtil obj = new HibernateUtil();
	String strid = (String) obj.operation(bean, SAVE);
	System.out.println(strid);
}

@RequestMapping()
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

@RequestMapping()
public static void delete() {

	CatBean bean = new CatBean("cat7", "catTes7");
	// update of cat4 ,Not working,time out unknown reason
	HibernateUtil obj = new HibernateUtil();
	String strid = (String) obj.operation(bean, DELETE);
	System.out.println(strid);
}

public static void main(String[] args) {
	read();
	readAll();
}
}
