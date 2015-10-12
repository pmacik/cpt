package org.pmacik.cpt.mqtt.spring;

public class CptBean {
   public String process(String in) {
      System.out.println("MQTT: ["+in+"]");
      return "Hello " + in;
   }
}
