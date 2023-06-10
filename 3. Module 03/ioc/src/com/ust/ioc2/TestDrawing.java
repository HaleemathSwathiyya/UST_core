package com.ust.ioc2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.ust.iocautowiring.B;

public class TestDrawing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("beans.xml"));
//		
//		Object obj4 = factory.getBean("line");
//		Line line = (Line)obj4;
//		line.DrawLine();
		
//		Object obj2 = factory.getBean("line");
//		System.out.println(obj);
//		Line line2 = (Line) obj;
//		line2.DrawLine();
		
//		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml"); //to print "from destroy()..."
		B b = (B) context.getBean("b");
		System.out.println(b);
		context.registerShutdownHook();
//		context.registerShutdownHook();  //to print "from destroy()..."
//		boolean exits = context.containsBean("line");
//		System.out.println(exits);
//		if(exits) {
//			
//			Object object = context.getBean("line");
//			if(object instanceof Line) {
//				Line line = (Line) object;
//				line.DrawLine();
//			}
//			
//		} //every bean created by spring network is singleton
		
//		boolean type = context.isSingleton("line");
//		System.out.println(type);
//		Object object1 = context.getBean("line");
//		Object object2 = context.getBean("line");
//		if(object1.hashCode() == object2.hashCode()) {
//			System.out.println("line is singleton");
//		}
		
//		Line line1 = (Line) context.getBean("line");
//		Line line2 = (Line) context.getBean("line");
//		if(line1.hashCode() == line2.hashCode()) {
//			System.out.println("line is singleton");
//		}
//		else {
//			System.out.println("line is not a singleton"); 
//			//In beans.xml, if scope="prototype", every time a bean is requested. new instance is returned.
//		}
		
		//Constructor Injection!
		
	}

}
