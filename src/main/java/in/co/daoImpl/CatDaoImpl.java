package in.co.daoImpl;

import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import in.co.dao.CatDao;
import in.co.dto.CatBean;
import in.co.util.HibernateUtil;

@Repository("catDao")
@Transactional
public class CatDaoImpl implements CatDao {

	private static Logger log = Logger.getLogger(CatDaoImpl.class);

	/* following code gives error of context */
	
	  private static AnnotationConfigApplicationContext context;
	  
	  private static CatDao catDAO;
	  
	 /* public static void init()
	  { 
		context=new  AnnotationConfigApplicationContext(); 
	  context.scan("in.co.dto");
	  context.refresh(); 
	  catDAO=(CatDao) context.getBean("catDAO");
	  
	  }*/
	 
	
	  Configuration cfg = new
	  Configuration().configure("in/co/util/hibernate.cfg.xml"); 
	  SessionFactory  sessionFactory = cfg.buildSessionFactory();
	 
	
	/*@Autowired
	private SessionFactory sessionFactory;//

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}*/
	/**/

	/*********** using util class *********************/
	HibernateUtil objUtil = new HibernateUtil();

	@Transactional
	@Override
	public CatBean findById(String id) {
		CatBean bean = new CatBean(id, "");

		Object o = objUtil.operation(bean, READ);
		CatBean outBean = (CatBean) o;

		log.debug(o);
		// System.out.println(o.toString());
		System.out.println("In catDao -id is: " + outBean.getCatId() + ", name is" + outBean.getCatName());
		return outBean;
	}

	@SuppressWarnings("deprecation")
	public CatBean findByName(String name) {
		CatBean bean = new CatBean("CatBean", "CatBean");
		Object o = objUtil.searchOperation(bean, name, SEARCH_BY_NAME);

		CatBean outBean = null;
		List<CatBean> list = (List<CatBean>) o;
		if (list.size() > 0) {
			outBean = (CatBean) list;
		}
		System.out.println("In catDao/findByName -id is: " + outBean.getCatId() + ", name is" + outBean.getCatName());
		System.out.println("In catDao/findByName" + outBean);
		return outBean; 
	}

	public List<CatBean> search(CatBean bean) {

		return null;
	}

	public List<CatBean> search(CatBean bean, int pageNo, int Pagesize) {
		return null;
	}

	public List<CatBean> list() {
		// just assgin table name in bean object
		CatBean bean = new CatBean("CatBean", "CatBean");// Assign table Name
															// only,trick

		Object o = objUtil.searchOperation(bean, "", READ_ALL);

		List<CatBean> list = (List<CatBean>) o;

		for (CatBean b : list) {
			System.out.println(b.getCatId() + " , " + b.getCatName());
		}
		return list;
	}

	public List<CatBean> list(int pageNo, int Pagesize) {
		return null;
	}
	@Transactional
	public String add(CatBean bean) {
		//Session session=sessionFactory.getSessionFactory().getCurrentSession();
		Session session = sessionFactory.getCurrentSession();
		String strId = (String) session.save(bean);
		//String strId = (String)this.sessionFactory.getCurrentSession().save(bean);
		// String strId= (String) objUtil.operation(bean,SAVE);
		System.out.println("in CatDaoImpl/add --> added id is: " + strId);
		return strId;
	}

	public void update(CatBean bean) {
	}

	@Override
	public void delete(CatBean bean) {
		// TODO Auto-generated method stub

	}

}
