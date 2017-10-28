package in.co.JunitTest;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.co.dao.CatDao;
import in.co.daoImpl.CatDaoImpl;
import in.co.dto.CatBean;

public class CatTest {

	private static AnnotationConfigApplicationContext context;
	
	private static CatDao catDAO;
	
	private CatBean beanDto;
	@BeforeClass
	public static void init(){
		context=new AnnotationConfigApplicationContext();
		context.scan("in.co.dto");
		context.refresh();
		catDAO=(CatDao) context.getBean("catDAO");
		
	}
	
	@Test
	public void test(){
		
	}
}
