package org.pmacik.cpt.cxfbean;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/cpt-cxfbean-jaxrs-java")
public class CptBean {

   @POST
   @Path("/post")
   public String post(String in) {
      return "Hello " + in;
   }

   @GET
   @Path("/get/{param}")
   public String getParam(@PathParam("param") String param) {
      return "Hello " + param;
   }

   @GET
   @Path("/get")
   public String get(@PathParam("param") String param) {
      return "Hello stranger!";
   }
}