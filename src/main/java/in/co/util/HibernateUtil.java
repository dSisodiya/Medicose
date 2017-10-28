package in.co.util;

import java.util.List;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import in.co.dto.BaseBean;

public class HibernateUtil {
	public static final String SAVE = "SAVE";
	public static final String DELETE = "DELETE";
	public static final String UPDATE = "UPDATE";
	public static final String READ = "READ";
	public static final String READ_ALL = "READ_ALL";
	public static final String SEARCH_BY_NAME="SEARCH_BY_NAME";
	
	//Configuration cfg = new Configuration().configure("in/co/util/hibernate.cfg.xml");
	
	
	public  Object operation(BaseBean baseBean, String Op) {
		Object o = null;
		Configuration cfg = new Configuration();
		cfg.configure("in/co/util/hibernate.cfg.xml");
		

		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();
		Transaction t = null;
		try {
			t = s.beginTransaction();
			ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
			Validator v = vf.getValidator();

			BaseBean objBean = baseBean;

			Set<ConstraintViolation<BaseBean>> seterror = v.validate(objBean);
			if (!seterror.isEmpty()) {
				for (ConstraintViolation<BaseBean> error : seterror) {
					System.out.println("In HibernateUtil-->"+error.getPropertyPath() + ":=" + error.getMessage());
				}
			} else {
				if (Op.equalsIgnoreCase(SAVE)) {
					o = (String) s.save(objBean);
				} else if (Op.equalsIgnoreCase(UPDATE)) {
					s.update(objBean);
				} else if (Op.equalsIgnoreCase(DELETE)) {
					s.delete(objBean);
				} else if (Op.equalsIgnoreCase(READ)) {
					// o=s.load(objBean.getClass(),objBean.getId());}
					o = s.get(objBean.getClass(), objBean.getId());
				} else if (Op.equalsIgnoreCase(READ_ALL)) {
					String qStr = baseBean.getId();// trick, It is name of Table
												// actually.
					Query q = s.createQuery("from " + qStr);
					List list = q.getResultList();

					o = (Object) list;
				}

				// System.out.println(strid);//
				s.flush();
				t.commit();
			}
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			s.close();
			sf.close();
		}

		return o;
	}
	public  Object searchOperation(BaseBean baseBean,String strVar,String Op) {
		Object o = null;
		Configuration cfg = new Configuration();
		cfg.configure("in/co/util/hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = null;
		try {
			t = s.beginTransaction();
			ValidatorFactory vf = Validation.buildDefaultValidatorFactory();
			Validator v = vf.getValidator();

			BaseBean objBean = baseBean;

			Set<ConstraintViolation<BaseBean>> seterror = v.validate(objBean);
			if (!seterror.isEmpty()) {
				for (ConstraintViolation<BaseBean> error : seterror) {
					System.out.println("In HibernateUtil-->"+error.getPropertyPath() + ":=" + error.getMessage());
				}
			} else {
				 if (Op.equalsIgnoreCase(READ)) {
					// o=s.load(objBean.getClass(),objBean.getId());}
					o = s.get(objBean.getClass(), objBean.getId());
				} else if (Op.equalsIgnoreCase(READ_ALL)) {
					String strClass = baseBean.getId();// trick, It is name of Table
												// actually. Class==table name
					Query q = s.createQuery("from " + strClass);
					List list = q.getResultList();
System.out.println("class name in HibernateUtil/searchOPeration-->"+strClass);
					o = (Object) list;
				} else if (Op.equalsIgnoreCase(SEARCH_BY_NAME)) {
					String strClass = baseBean.getId();// trick, It is name of Table
					// actually. Class==table name
					Query q = s.createQuery("from " + strClass +" C WHERE C.catName = "+strVar );
					List list = q.getResultList();

					o = (Object) list;
					}

				// System.out.println(strid);//
				s.flush();
				t.commit();
			}
		} catch (HibernateException e) {
			t.rollback();
			e.printStackTrace();
		} finally {
			s.close();
			sf.close();
		}

		return o;
	}

}
