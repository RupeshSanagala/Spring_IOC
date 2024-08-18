package springioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Dog implements Animal{
	
	public void sound() {
		System.out.println("Dog is Barking");
	}

}
