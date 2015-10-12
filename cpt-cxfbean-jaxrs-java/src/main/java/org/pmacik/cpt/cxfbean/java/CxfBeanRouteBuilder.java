package org.pmacik.cpt.cxfbean.java;

import org.apache.camel.builder.RouteBuilder;

public class CxfBeanRouteBuilder extends RouteBuilder {
   @Override
   public void configure() throws Exception {
      from("jetty:http://" + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT)
            + "?matchOnUriPrefix=true")
            .to("cxfbean:cptBean?");
   }
}
