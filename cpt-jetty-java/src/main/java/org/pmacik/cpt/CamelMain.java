package org.pmacik.cpt;

import org.apache.camel.CamelContext;

import org.apache.camel.impl.DefaultCamelContext;
import org.pmacik.cpt.jetty.java.JettyRouteBuilder;

public class CamelMain {

   public static void main(String[] args) throws Exception {
      CamelContext ctx = new DefaultCamelContext();
      ctx.addRoutes(new JettyRouteBuilder());
      ctx.start();
   }
}
