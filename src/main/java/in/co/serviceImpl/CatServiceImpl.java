package in.co.serviceImpl;

import in.co.dao.CatDao;
import in.co.daoImpl.CatDaoImpl;
import in.co.dto.CatBean;
import in.co.service.CatService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
//@Repository
public class CatServiceImpl implements CatService{

	
	@Autowired
     private CatDao dao;
	//private CatDao dao=new CatDaoImpl();
	/*
	public CatServiceImpl(CatDao dao2) {
		// TODO Auto-generated constructor stub
	}
*/

	/*public CatServiceImpl() {
		// TODO Auto-generated constructor stub
	}*/


	@Override
	public String add(CatBean bean) {
		String strId=dao.add(bean);
		return strId;
	}


	@Override
	public void update(CatBean dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(CatBean dto) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CatBean findByName(String name) {
		CatBean bean=dao.findByName(name);
		System.out.println("in catservice findbyname-->"+bean);
		return bean;
	}

	@Override
	@Transactional
	public CatBean findById(String id) {
		CatBean bean=dao.findById(id);
		System.out.println("In catService -id is: "+bean.getCatId()+", name is"+bean.getCatName());
		return bean;
	}

	@Override
	public List<CatBean> search(CatBean bean) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CatBean> search(CatBean bean, int pageNo, int Pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CatBean> list() {
		List list=dao.list();
		return list;
	}

	@Override
	public List<CatBean> list(int pageNo, int Pagesize) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
