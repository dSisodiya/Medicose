package in.co.dao;

import java.util.List;

import in.co.dto.BaseBean;
import in.co.dto.CatBean;

public interface CatDao extends StrCON{

	CatBean findByName(String id);
	CatBean findById(String name);
	
	List<CatBean> search(CatBean bean);
	List<CatBean> search(CatBean bean,int pageNo, int Pagesize);
	List<CatBean> list();
	List<CatBean> list(int pageNo, int Pagesize);
	
	String add(CatBean bean);
	void update(CatBean bean);
	void delete(CatBean bean);
	
	 

}
