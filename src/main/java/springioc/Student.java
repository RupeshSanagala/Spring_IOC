package springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value("1")
	private int id;
	@Value("guru")
	private String name;
	@Value("4562646")
	private long contact;
	@Autowired
	private Laptop laptop;
//	public Student(int id, String name, long contact) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.contact = contact;
//	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", contact=" + contact + ", laptop=" + laptop + "]";
	}

	
	

	

}
