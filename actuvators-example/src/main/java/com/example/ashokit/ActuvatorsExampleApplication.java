package com.example.ashokit;

import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.embedded.tomcat.TomcatConnectorCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.ashokit.config.ChanduConfigration;

@SpringBootApplication
public class ActuvatorsExampleApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ActuvatorsExampleApplication.class, args);
		System.out.println("Welcoem to the actuvators in the spring boot");
		ChanduConfigration bean = context.getBean(ChanduConfigration.class);
		bean.dd();
	}
	
	  @Bean
	    public ConfigurableServletWebServerFactory webServerFactory() {
	        TomcatServletWebServerFactory factory = new TomcatServletWebServerFactory();
	        factory.addConnectorCustomizers(new TomcatConnectorCustomizer() {
	            @Override
	            public void customize(Connector connector) {
	                connector.setProperty("relaxedQueryChars", "^0-9{},[],()");
	            }
	        });
	        return factory;
	    }
	}



