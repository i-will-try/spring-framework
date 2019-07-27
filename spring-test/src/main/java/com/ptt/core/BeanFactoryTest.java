package com.ptt.core;

import com.ptt.core.pojo.MyTestBean;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class BeanFactoryTest {
	@Test
	public void test(){
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("com.ptt/beanFactoryTest.xml"));
		MyTestBean myBean = (MyTestBean)bf.getBean("myTestBean");
		System.out.println(myBean.getName());
	}
}
