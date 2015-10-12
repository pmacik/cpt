package org.pmacik.cpt;

import org.apache.camel.CamelContext;

import org.apache.camel.component.cxf.cxfbean.CxfBeanComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.impl.SimpleRegistry;
import org.apache.camel.spi.Registry;
import org.pmacik.cpt.cxfbean.CptBean;
import org.pmacik.cpt.cxfbean.java.CxfBeanRouteBuilder;

public class CamelMain {

   public static void main(String[] args) throws Exception {
      SimpleRegistry registry = new SimpleRegistry();
      registry.put("cptBean", new CptBean());

      CamelContext ctx = new DefaultCamelContext(registry);
      ctx.addRoutes(new CxfBeanRouteBuilder());

      ctx.start();
   }
}
