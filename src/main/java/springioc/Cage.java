package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Cage{
	@Autowired
	@Qualifier(value = "cat")
	Animal animal;
	void cageAnimal() {
		animal.sound();
	}
	
}
