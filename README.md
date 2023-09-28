# Springboot-profiles-and-annotations
This project contains code for managing different profiles + annotations for java based and annotation based configurations

Spring core annotation tutorial + spring REST and JPA annotations list

HOW TO MANAGE DIFFERENT PROFILES IN SPRINGBOOT? <br>
BY DEFAULT WE GET application.properties (main configuration file) file  <br>
IF WE HAVE TO CREATE PROPERTY FILE FOR DEV AND TEST ENVIRONMENT <br>
application-dev.properties <br>
application-test.properties <br>
application-production.properties <br>

// THEN IN MAIN CONFIG FILE WE CAN HAVE TO DECLARE ACTIVE PROFILE in our main configuration file. EX:  <br>
spring.profiles.active=test  <br>
//--------------------------------Spring Core annotations--------------<br>
@Configuration      @Bean      @Scope("prototype")     @Lazy    <br>
 
  @Primary   @Qualifier   @Value     @PropertySource       @ComponentScan    <br>
