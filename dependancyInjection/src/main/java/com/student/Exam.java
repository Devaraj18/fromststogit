package com.student;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam {
	public static void main(String []args) {
		
		ApplicationContext context =new ClassPathXmlApplicationContext("beans.xml");
		Student obj=context.getBean("std",Student.class);
		obj.studentInfo();
		
		Student obj2=context.getBean("std2",Student.class);
		obj2.studentInfo();
		
	/* at our beans.xml file 
	 * what happen internally
	 * <bean id="std" class="com.student.Student">
       <property name="sName" value="Devaraj"></property>
        <property name="sAge" value="25"></property>
      </bean>	
      
      IOC Container 
      (ApplicationContext)
      read this beans.xml file there
      id = std particular id for Studnet class means 
      means create obj for that class and inside our student class 
      the <property> set the value for our variables;
      
      while we using property tag it looking for setter method
      to set the value for property .
       
      using the getBean("id name" ,classname .class 
      
      
	 */
		
		
		
	}

}
