/*package in.co.config;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import in.co.dao.CatDao;
import in.co.daoImpl.CatDaoImpl;
import in.co.service.CatService;
import in.co.serviceImpl.CatServiceImpl;


 * Step 2: 
 * Configure Service/DAO Layer Beans Using JavaConfig
 *  

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(basePackages="in.co")
@ComponentScan(basePackages="in.co")
public class AppConfig {
	@Bean
    public CatService catService(CatDao dao){
        return new CatServiceImpl(dao);
    }
    @Bean
    public CatDao userDao(DataSource dataSource){
        return new CatDaoImpl();
    }
	
	@Bean
    public CatService catService(){
        return new CatServiceImpl();
    }
    @Bean
    public CatDao userDao(){
        return new CatDaoImpl();
    }
    @Bean
    public DataSource dataSource(){
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3309/MedicoDB");
        dataSource.setUsername("root");
        dataSource.setPassword("1234");
        return dataSource;
    }
}
*/