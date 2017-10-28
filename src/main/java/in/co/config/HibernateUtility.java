package in.co.config;

import java.beans.PropertyVetoException;
import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class HibernateUtility {

private static final String DATABASE_URL="jdbc:mysql://localhost:3309/MedicoDB";
private static final String DATABASE_DRIVER="com.mysql.jdbc.Driver";
private static final String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
private static final String DATABASE_USERNAME="root";
private static final String DATABASE_PASSWORD="1324";

	//1-Bean for Datasource

	public static DataSource getDataSource() {
		ComboPooledDataSource cpds=new ComboPooledDataSource();
		try {
			cpds.setDriverClass(DATABASE_DRIVER);
		} catch (PropertyVetoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		cpds.setJdbcUrl(DATABASE_URL);
		cpds.setUser(DATABASE_USERNAME);
		cpds.setPassword(DATABASE_PASSWORD);
		
		cpds.setInitialPoolSize(20);
		cpds.setMinPoolSize(10);
		cpds.setMaxPoolSize(100);
		cpds.setAcquireIncrement(5);
		return cpds;
		}
	//2- Bean for session factory.
	
	public static SessionFactory getSessionFactory() {
		LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(getDataSource());
		builder.addProperties(getHibernateProperty());
		
		return builder.buildSessionFactory();
	}

	// All the hiberbnate properties are set here
	private static Properties getHibernateProperty() {
		Properties p=new Properties();
		p.put("hibernate.dialect",DATABASE_DIALECT);
		p.put("hibernate.show_sql",true);
		p.put("hibernate.hbm2ddl.auto","update");
		
		return p;
	}

	//3-Transaction manager bean 
	
	public HibernateTransactionManager getTransactioManager(SessionFactory sessionFactory){
		HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
		return transactionManager;
		
	}
	//-----------------------------------------//
	
}
