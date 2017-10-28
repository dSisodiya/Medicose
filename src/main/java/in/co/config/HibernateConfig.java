package in.co.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;



@Configuration
@ComponentScan(basePackages={"in.co.config"})
//@ComponentScan(basePackages={"in.co.dto"})
@EnableTransactionManagement
public class HibernateConfig {
	
	//private static final String DATABASE_URL="jdbc:mysql://localhost/~/MedicoDB";

private static final String DATABASE_URL="jdbc:mysql://localhost:3309/MedicoDB";
private static final String DATABASE_DRIVER="com.mysql.jdbc.Driver";
private static final String DATABASE_DIALECT="org.hibernate.dialect.MySQLDialect";
private static final String DATABASE_USERNAME="root";
private static final String DATABASE_PASSWORD="1234";

//1-Bean for Datasource
@Bean
public DataSource getDataSource() {
	BasicDataSource datasource=new BasicDataSource();
	datasource.setUrl(DATABASE_URL);
	datasource.setDriverClassName(DATABASE_DRIVER);
	datasource.setUsername(DATABASE_USERNAME);
	datasource.setPassword(DATABASE_PASSWORD);
	
	/*ComboPooledDataSource cpds=new ComboPooledDataSource();
	try {
		cpds.setDriverClass(DATABASE_DRIVER);
	} catch (PropertyVetoException e) {
		System.out.println("hey we got a exception(PropertyVetoException) in HibernateConfig file : "+e.getMessage());
		e.printStackTrace();
	}
	cpds.setJdbcUrl(DATABASE_URL);
	cpds.setUser(DATABASE_USERNAME);
	cpds.setPassword(DATABASE_PASSWORD);
	
	cpds.setInitialPoolSize(20);
	cpds.setMinPoolSize(10);
	cpds.setMaxPoolSize(100);
	cpds.setAcquireIncrement(5);
	return cpds;*/
	
	return datasource;
	}
//2- Bean for session factory.
@Bean
public SessionFactory getSessionFactory(DataSource datasource){
	LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(datasource);
	builder.addProperties(getHibernateProperty());
	//builder.scanPackages("in.co.dto,in.co.dao,in.co.service");
	builder.scanPackages("in.co.dao");
	return builder.buildSessionFactory();
}

// All the hiberbnate properties are set here
private Properties getHibernateProperty() {
	Properties p=new Properties();
	p.put("hibernate.dialect",DATABASE_DIALECT);
	p.put("hibernate.show_sql",true);
	p.put("hibernate.hbm2ddl.auto","update");
	
	return p;
}

//3-Transaction manager bean 
@Bean
public HibernateTransactionManager getTransactioManager(SessionFactory sessionFactory){
	HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
	return transactionManager;
	
}
}



