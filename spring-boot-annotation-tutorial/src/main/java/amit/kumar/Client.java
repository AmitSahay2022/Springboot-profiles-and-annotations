package amit.kumar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.sahay.tutorial.config.BeanConfiguration;

public class Client {
	public static void main(String[] args) {
		//Creating IOC Container by passing Configuration class name so all those bean which is defined in Configuration class can be accessed
       ApplicationContext context=new AnnotationConfigApplicationContext(BeanConfiguration.class);
       
       //Retrieving Bean form the IOC Container 
       Traveler traveler = context.getBean(Traveler.class);
       traveler.going();
	}
	
	
}
