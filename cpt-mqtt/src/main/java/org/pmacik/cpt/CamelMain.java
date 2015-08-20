package org.pmacik.cpt;

import org.apache.camel.CamelContext;

import org.apache.camel.component.mqtt.MQTTComponent;
import org.apache.camel.impl.DefaultCamelContext;
import org.pmacik.cpt.mqtt.java.MqttRouteBuilder;
import org.pmacik.cpt.mqtt.java.BrokerThread;
import org.pmacik.cpt.mqtt.java.RuntimeProperties;

import java.net.URI;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CamelMain {
   private static ExecutorService es = Executors.newSingleThreadExecutor();

   public static void main(String[] args) throws Exception {
      es.submit(new BrokerThread("mqtt", new URI("mqtt://" + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT))));

      final CamelContext ctx = new DefaultCamelContext();
      final MQTTComponent mqttComponent = new MQTTComponent();
      ctx.addComponent("mqtt", mqttComponent);
      ctx.addRoutes(new MqttRouteBuilder());
      ctx.start();
   }
}
