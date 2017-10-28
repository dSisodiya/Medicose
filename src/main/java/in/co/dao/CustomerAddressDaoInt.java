package in.co.dao;

import java.util.List;

import in.co.dto.CustomerAddressBean;


public interface CustomerAddressDaoInt {

	CustomerAddressBean findByName(String id);
	CustomerAddressBean findById(String name);
	
	List<CustomerAddressBean> search();
	List<CustomerAddressBean> search(CustomerAddressBean bean,int pageNo, int Pagesize);
	List<CustomerAddressBean> list();
	List<CustomerAddressBean> list(int pageNo, int Pagesize);
	
	String add(CustomerAddressBean bean);
	void update(CustomerAddressBean bean);
	void delete(CustomerAddressBean bean);
}
