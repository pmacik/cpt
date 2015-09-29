package org.pmacik.cpt;

public class CptBean {
   public String processPost(String in) {
      return "Hello " + in;
   }

   public String processGet() {
      return "Hello";
   }
}
