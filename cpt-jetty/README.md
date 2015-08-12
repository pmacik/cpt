C.P.T. - Jetty
==============

Build
-----
To build this project use

   mvn (clean) package

To run the project you can execute the following Maven goal

   mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

   osgi:install -s mvn:org.pmacik/cpt-jetty/1.0.0-SNAPSHOT

To produce executable jar use

   mvn clean package -Pdistro