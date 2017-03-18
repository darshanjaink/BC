//package config;

//
  
 //   import java.util.Properties;
//
//import javax.sql.DataSource;
//
//
//import org.apache.commons.dbcp2.BasicDataSource;
//import org.bc.DTO.UserRegisterationDTO;
//import org.bc.Dao.IUserMasterDAO;
//import org.bc.Dao.UserMasterDAO;
//import org.bc.Entities.*;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.orm.hibernate4.HibernateTransactionManager;
//import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;
//import org.springframework.transaction.annotation.EnableTransactionManagement;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//
//@Configuration
//@ComponentScan("net.codejava.spring")
//@EnableTransactionManagement
//public class ApplicationContextConfig {
    /*@Bean(name = "viewResolver")
    public InternalResourceViewResolver getViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }*/
    
   /*
    @Bean(name = "dataSource")
    public DataSource getDataSource() {
    	BasicDataSource dataSource = new BasicDataSource();
    	dataSource.setDriverClassName("com.mysql.jdbc.Driver");
    	dataSource.setUrl("jdbc:mysql://localhost:3306/bookclub");
    	dataSource.setUsername("root");
    	dataSource.setPassword("har@tcm1");
    	
    	return dataSource;
    }
  
    
    private Properties getHibernateProperties() {
    	Properties properties = new Properties();
    	properties.put("hibernate.show_sql", "true");
    	properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
        properties.put("hibernate.hbm2ddl.auto", "create"); //wil create table auto
    	return properties;
    }
    
    @Autowired
    @Bean(name = "sessionFactory")
    public SessionFactory getSessionFactory(DataSource dataSource) {
            
    	LocalSessionFactoryBuilder sessionBuilder = new LocalSessionFactoryBuilder(dataSource);
    	sessionBuilder.addProperties(getHibernateProperties());
    	sessionBuilder.addAnnotatedClasses(UserMasterEntity.class);
    	return sessionBuilder.buildSessionFactory();
    }*/
  /*    */
    
/*	@Autowired
	@Bean(name = "transactionManager")
	public HibernateTransactionManager getTransactionManager(
			SessionFactory sessionFactory) {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager(
				sessionFactory);

		return transactionManager;
	}
     */
   /* @Autowired
    @Bean(name = "userDao")
    public IUserMasterDAO getUserDao(SessionFactory sessionFactory) {
    	return new UserMasterDAO(sessionFactory);
    }*/
    
   /* public IUserMasterDAO TempgetUserDao() {
        
        DataSource oDataSource=getDataSource();
        SessionFactory oSessionFactory=getSessionFactory(oDataSource);
    	return new UserMasterDAO(oSessionFactory);
    }*/
//}
