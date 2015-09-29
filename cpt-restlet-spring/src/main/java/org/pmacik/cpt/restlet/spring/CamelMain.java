package org.pmacik.cpt.restlet.spring;

import org.apache.camel.spring.SpringCamelContext;

public class CamelMain {

   public static void main(String[] args) throws Exception {
      SpringCamelContext.springCamelContext("META-INF/spring/camelContext.xml");
   }
}
