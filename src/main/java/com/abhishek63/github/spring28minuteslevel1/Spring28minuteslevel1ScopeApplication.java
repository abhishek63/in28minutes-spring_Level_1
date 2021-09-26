package com.abhishek63.github.spring28minuteslevel1;

import com.abhishek63.github.spring28minuteslevel1.basic.BinarySearchImpl;
import com.abhishek63.github.spring28minuteslevel1.scope.PersonDAO;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import org.slf4j.Logger;

@SpringBootApplication
public class Spring28minuteslevel1ScopeApplication {

	private static Logger LOGGER = (Logger) LoggerFactory.getLogger(Spring28minuteslevel1ScopeApplication.class);
	public static void main(String[] args) {

		ApplicationContext applicationContext = SpringApplication.run(Spring28minuteslevel1ScopeApplication.class, args);

		PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
		PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

		LOGGER.info("{}",personDAO1);
		LOGGER.info("{}",personDAO1.getJdbcConncetion());

		LOGGER.info("{}",personDAO2);
		LOGGER.info("{}",personDAO2.getJdbcConncetion());

	}

}
