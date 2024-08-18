package springioc;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component
public class Cat implements Animal {
	public void sound() {
		System.out.println("cat says meow");
		
	}

}
