package in.co.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.CustomerBean;
import in.co.util.HibernateUtil;

public class CustomerController extends MainController {

	// -----------Methods-----------
	@RequestMapping()
	public static void read() {
		CustomerBean bean = new CustomerBean("Cust2","","","");
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		CustomerBean b = (CustomerBean) o;
		System.out.println(b.getId() + " , " + b.getCustName()+" , "+b.getCustEmail()+" , "+b.getCustPhone());
		}

	@RequestMapping()
	public static void readAll() {
		// just assgin table name in bean object
		CustomerBean bean = new CustomerBean("CustomerBean","","","");// Assign table Name
															// only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);

		List<CustomerBean> list = (List<CustomerBean>) o;

		for (CustomerBean b : list) {
			System.out.println(b.getId() + " , " + b.getCustName()+" , "+b.getCustEmail()+" , "+b.getCustPhone());
		}
	}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping()
	public static void Add() {

		CustomerBean bean = new CustomerBean("Cust4","CustNAme4", "CustemAL4","CUSTpHONE4");
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		CustomerBean bean = new CustomerBean("Cust1","CustNAme1xx", "CustemAL1xx","CUSTpHONE1");
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

		CustomerBean bean = new CustomerBean("Cust1","CustNAme1", "CustemAL1","CUSTpHONE1");
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}

	// For testing purpose
	public static void main(String[] args) {
		read();
		//Add();
		//update();
		//delete();
		//readAll();
	}
}