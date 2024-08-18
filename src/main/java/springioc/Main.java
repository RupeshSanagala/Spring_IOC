package springioc;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main {
	public static void main(String[] args) {
//		ClassPathResource resource = new ClassPathResource("user.xml");
//		BeanFactory factory = new XmlBeanFactory(resource);
//		
//		Student stu = factory.getBean(Student.class);
		
//		Student stu1 = factory.getBean(Student.class);
		
//		System.out.println(stu);
//		
//		Laptop l = factory.getBean(Laptop.class);
//		System.out.println(l);
		
//	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//	Student stu = context.getBean(Student.class);
//	System.out.println(stu);
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		Student stu = context.getBean(Student.class);
		System.out.println(stu);
	}

}
