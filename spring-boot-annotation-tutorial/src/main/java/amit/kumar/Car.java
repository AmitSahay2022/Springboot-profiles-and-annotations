package amit.kumar;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary

public class Car implements Vehicle {
	@Override
	public void move() {
		System.out.println("Car is Moving..... at 60kmph");

	}
}
//@Primary annotation gives highest preference to the bean if there are multiple beans of the same type