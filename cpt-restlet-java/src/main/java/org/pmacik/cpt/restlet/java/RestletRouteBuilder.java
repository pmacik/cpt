package org.pmacik.cpt.restlet.java;

import org.apache.camel.builder.RouteBuilder;
import org.pmacik.cpt.CptBean;

public class RestletRouteBuilder extends RouteBuilder {
   @Override
   public void configure() throws Exception {
      from("restlet:http://" + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT) + "/cpt-restlet-java/post?restletMethods=POST").bean(CptBean.class, "processPost");
      from("restlet:http://" + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT) + "/cpt-restlet-java/get?restletMethods=GET").bean(CptBean.class, "processGet");
   }
}
