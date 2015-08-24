package org.pmacik.cpt.mqtt.java;

import org.apache.activemq.broker.BrokerService;

import java.net.URI;

public class BrokerThread implements Runnable {
   private String name;
   private URI uri;

   public BrokerThread(String name, URI uri) {
      this.name = name;
      this.uri = uri;
   }

   @Override
   public void run() {
      try {
         final BrokerService broker = new BrokerService();
         broker.setBrokerName(name);
         broker.setPersistent(false);
         broker.setUseJmx(true);
         broker.addConnector(uri);
         broker.start();
      } catch (Exception e) {
         e.printStackTrace();
      }
   }
}
