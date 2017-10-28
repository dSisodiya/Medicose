package in.co.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;

import in.co.dto.CustomerAddressBean;
import in.co.util.HibernateUtil;

public class CustomerAddressController  extends MainController {

	// -----------Methods-----------
	@RequestMapping()
	public static void read() {
		CustomerAddressBean bean = new CustomerAddressBean("1","Cust2","","","",2);
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ);
		CustomerAddressBean b = (CustomerAddressBean) o;
		System.out.println(b.getId() + " , "+b.getCustId()+" , " + b.getAddress()+" , "+b.getDistrict()+" , "+b.getState()+" , "+b.getPinCode());
		}

	@RequestMapping()
	public static void readAll() {
		// just assgin table name in bean object
		CustomerAddressBean bean = new CustomerAddressBean("CustomerAddressBean","","","","",44);// Assign table Name
															// only,trick
		HibernateUtil obj = new HibernateUtil();
		Object o = obj.operation(bean, READ_ALL);

		List<CustomerAddressBean> list = (List<CustomerAddressBean>) o;

		for (CustomerAddressBean b : list) {
			System.out.println(b.getId() + " , "+b.getCustId()+" , " + b.getAddress()+" , "+b.getDistrict()+" , "+b.getState()+" , "+b.getPinCode());
		}
	}

	/**
	 * ----------Add, Update, Delete-----------
	 */
	@RequestMapping()
	public static void Add() {

		CustomerAddressBean bean = new CustomerAddressBean("5","Cust5","Addres5","CustNAme5","Distr5",444444);
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, SAVE);
		System.out.println(strid);
	}

	@RequestMapping()
	public static void update() {

		CustomerAddressBean bean = new CustomerAddressBean("1","Custxx1","","CustNdd1", "Custdistr",546);
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

		CustomerAddressBean bean = new CustomerAddressBean("1","Cust1","","CustNAme1", "CustemAL1",245001);
		// update of cat4 ,Not working,time out unknown reason
		HibernateUtil obj = new HibernateUtil();
		String strid = (String) obj.operation(bean, DELETE);
		System.out.println(strid);
	}

	// For testing purpose
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//read();
		//Add();
		//update();
		//delete();
		readAll();
	}

}
