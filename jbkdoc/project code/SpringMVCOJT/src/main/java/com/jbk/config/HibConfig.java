package com.jbk.config;

import org.hibernate.boot.spi.AdditionalJaxbMappingProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.jbk.entity.Admin;
import com.jbk.entity.Student;
import com.jbk.entity.Subject;



@Configuration
@EnableWebMvc
public class HibConfig {

	@Autowired
	ApplicationContext context;
	
	@Bean
	public LocalSessionFactoryBean getFactoryBean()
	{
		System.out.println("Hib configuration LocalSessionFactoryBean ");
		System.out.println("getFactoryBean() method");  
		LocalSessionFactoryBean factorybean=new LocalSessionFactoryBean();
		factorybean.setConfigLocation(context.getResource("classpath:hibernate.cfg.xml"));
		factorybean.setAnnotatedClasses(Student.class,Subject.class,Admin.class);
		return factorybean;
		
		
	}
}
