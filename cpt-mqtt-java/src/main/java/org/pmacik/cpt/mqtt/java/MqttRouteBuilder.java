package org.pmacik.cpt.mqtt.java;

import org.apache.camel.builder.RouteBuilder;
import org.pmacik.cpt.CptBean;

public class MqttRouteBuilder extends RouteBuilder {
   @Override
   public void configure() throws Exception {
      from("mqtt://mqtt-server?subscribeTopicName="
            + System.getProperty(RuntimeProperties.REQUEST_TOPIC)
            + "&host=tcp://"
            + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT)
            + "/&qualityOfService=ExactlyOnce")
            .bean(CptBean.class, "process")
            .to("mqtt://mqtt-server?publishTopicName=" + System.getProperty(RuntimeProperties.RESPONSE_TOPIC) + "&host=tcp://"
                  + System.getProperty(RuntimeProperties.SERVER_HOST) + ":" + System.getProperty(RuntimeProperties.SERVER_PORT)
                  + "/&qualityOfService=ExactlyOnce");
   }
}
