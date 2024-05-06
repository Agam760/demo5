package com.example.demo5;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



import jakarta.annotation.PostConstruct;

@SpringBootApplication
public class Demo5Application {
	  public static Logger logger=LoggerFactory.getLogger(Demo5Application.class);
	     @PostConstruct
	     public void intt() {
	    	 logger.info("Application started......");
	     }
		public static void main(String[] args) {
			logger.info("Application executed.......");
		SpringApplication.run(Demo5Application.class, args);
	}

}
