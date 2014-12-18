package org.pmacik.cpt.jetty;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.main.Main;
import org.apache.camel.spring.SpringCamelContext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CamelMain {

	public static void main(String[] args) throws Exception {
		SpringCamelContext.springCamelContext("META-INF/spring/camelContext.xml");
	}
}
