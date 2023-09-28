package com.sahay.tutorial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import com.sahay.tutorial.beans.ScopeTutorial;
import com.sahay.tutorial.beans.TestBean;
import com.sahay.tutorial.beans.ValueAnnotationDemo;
import com.sahay.tutorial.beans.ValueAnnotationDemo2;
import com.sahay.tutorial.dto.Mail;
import com.sahay.tutorial.repo.ShowConfigDetails;
import com.sahay.tutorial.service.Beverages;
import com.sahay.tutorial.service.FoodService;

import amit.kumar.Traveler;
import amit.kumar.Vehicle;

@SpringBootApplication // == @Configuration + @Autoconfiguration + ComponentScan
public class SpringBootAnnotationTutorialApplication implements CommandLineRunner {
	@Autowired
	private TestBean testBean;
	@Autowired
	@Qualifier("muttonBiryani")
	private FoodService service;
	@Autowired
	private Beverages beverages;
	@Autowired
	private ValueAnnotationDemo demo;
	@Autowired
	private ValueAnnotationDemo2 demo2;
	@Autowired
	private Mail mail;

	@Autowired
	private ShowConfigDetails details;

	@Autowired
	private ScopeTutorial scopeTutorial;

	// ----------Importing from other package-------------------
	@Autowired
	private @Qualifier("bike") Vehicle vehicle;

	@Autowired
	private Vehicle vehicle2;

	@Autowired
	private Vehicle vehicle3;
	
	@Autowired
	private Traveler traveler;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAnnotationTutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		testBean.method();
		service.makeFood();
		beverages.drink();
		demo.print();
		demo2.showMessage();
		mail.info();

		details.show();

		scopeTutorial.protoDemo();
		scopeTutorial.protoDemo();

		vehicle.move();
		vehicle2.move();

		System.out.println(vehicle.hashCode());
		System.out.println(vehicle2.hashCode());
		System.out.println(vehicle2 == vehicle3);
		
		traveler.going();

	}

}
//-----------------------------------------------------------------------------------------------------------
// WHAT TO LEARN FROM THIS PROJECT?
//  (1) ABOUT MOST COMMON ANNOTATIONS OF SPRING BOOT (2) HOW TO MANAGE DIFFERENT PROFILES IN SPRINGBOOT
// BY DEFAULT WE GET application.properties
//                                                         (main configuration file) file

//                                                       IF WE HAVE TO CREATE PROPERTY FILE FOR DEV AND TEST ENVIRONMENT
//                                                  application-dev.properties
//                                                  application-test.properties
//                                                  application-production.properties

// THEN IN MAIN CONFIG FILE WE CAN HAVE TO DECLARE ACTIVE PROFILE. EX:    

//spring.profiles.active=test
//---------------------------------------------------------------------------------------------------
/*
 * Spring boot Stereo type annotations: we already knows it (4)
 * 
 * @Component
 * 
 * @Controller @Service @Repository
 * 
 * 
 * 
 */
//---------------------------------------------------------------------------------------------------
/*
 * Spring Core Annotations (7)
 * 
 *
 * @Configuration @Bean @Scope("prototype") @Lazy
 * 
 * @Primary @Value @PropertySource
 */
//---------------------------------------------------------------------------------------------------
/*
 * REST CONTROLLER RELATED ANNOTATIONS (11)
 * 
 * 
 * @RestController @RequestMapping @GetMapping @PostMapping @PutMapping @DeleteMapping
 * 
 * @RequestBody @PathVariable @RequestParam @RestControllerAdvice @ExceptionHandler
 */
//---------------------------------------------------------------------------------------------------
/*
 * SPRING DATA JPA RELATED ANNOTATIONS: (11)
 * 
 * @Entity @Table @Id @GeneratedValue @Column @OneToOne @OneToMany @ManyToOne @ManyToMany @Transactional
 * 
 * @OnDelete
 * 
 * 
 */
//----------------------------------------------------------------------------------------------------
/*
 * In JAVA BASED CONFIGURATION WE USE ONLY @Configuration and @Bean
 * annotations. @Bean is method level we create a method which returns instance
 * of an object and at the top of that method we write @Bean
 * 
 * In Annotation based CONFIGURATION WE
 * USE @Component, @Autowired, @Primary, @Qualifier
 * 
 * @Controller @Service @Repository @ComponentScan
 * 
 */
//In Real time project we use mix of Annotation based + Java based Configuration

// Client Id:   376483243204-dcst47r4ka2nn5qs3sk10d115qntn9pi.apps.googleusercontent.com
// Client secret:  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
