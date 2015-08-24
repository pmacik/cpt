package org.pmacik.cpt.jetty.java;

import org.apache.camel.builder.RouteBuilder;
import org.pmacik.cpt.CptBean;

public class JettyRouteBuilder extends RouteBuilder {
   @Override
   public void configure() throws Exception {
      from("jetty:http://" + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT) + "/cpt-jetty-java").bean(CptBean.class, "process");
   }
}
