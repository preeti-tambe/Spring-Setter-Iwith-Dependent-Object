import org.apache.log4j.lf5.util.Resource;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

import model.Employee;

public class Test {

	public static void main(String[] args) {  
	    ClassPathResource r=new ClassPathResource("applicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(r);  
	      
	    Employee e=(Employee)factory.getBean("obj");  
	    e.displayInfo();  
	      
	}  
}
