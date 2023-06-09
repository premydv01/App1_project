package com.coredi.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.coredi.beans.MessageWriter;
import com.coredi.beans.IMessageFormatter;


/**
 * @author Prabhat
 *
 */
public class CoreDITest {

	public static void main(String[] args) {
		Resource resource=new ClassPathResource("com/coredi/common/application-context.xml");
		BeanFactory beanFactory=new XmlBeanFactory(resource);
     
		MessageWriter messageWriter=beanFactory.getBean
				("messageWriter",MessageWriter.class);
		
		
	/**	
        IMessageFormatter htmlMessageFormatter=beanFactory.getBean
        		("htmlMessageFormatter",IMessageFormatter.class);
        IMessageFormatter pdfMessageFormatter=beanFactory.getBean
        ("pdfMessageFormatter",IMessageFormatter.class);		
        messageWriter.setMessageFormatter(pdfMessageFormatter);
   **/    
		
        messageWriter.writeMessage("WELCOME TO SPRING FRAMEWORK");
	}

}
