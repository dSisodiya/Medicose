package in.co.service;

import java.util.List;

import in.co.dto.CatBean;

public interface CatService {

	List<CatBean> list(int pageNo, int Pagesize);

	List<CatBean> list();

	String add(CatBean bean);

	void update(CatBean dto);

	void delete(CatBean dto);

	CatBean findById(String id);

	List<CatBean> search(CatBean bean);

	CatBean findByName(String name);

	List<CatBean> search(CatBean bean, int pageNo, int Pagesize);

}
