package com.abc.springcore.bean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class HelloBeanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		HelloBean o=new HelloBean();
//		o.setMessage("Hello Spring");
//		o.sayHello();
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("appcontext.xml");
        HelloBean helloBean = (HelloBean) context.getBean("hello");
        MessageBean msgBean = (MessageBean) context.getBean("hi");    
        helloBean.sayHello();
        msgBean.display();   
	}

}
