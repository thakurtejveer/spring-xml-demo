package com.stackroute;

import com.stackroute.domain.BeanLifecycleDemoBean;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class Main
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        ((AbstractApplicationContext)context).registerShutdownHook();
        Movie movie1=context.getBean("movie",Movie.class);
        movie1.printActor();
        BeanLifecycleDemoBean beanLifecycleDemoBean=context.getBean("beanLifeCycle", BeanLifecycleDemoBean.class);

//        Movie movie2=context.getBean("movieX",Movie.class);
//        System.out.println(movie1==movie2);
//        XmlBeanFactory factory= new XmlBeanFactory(new ClassPathResource("bean.xml"));
//        Movie movi=factory.getBean("movie", Movie.class);
//        //Movie movi=(Movie)factory.getBean("movie"); // // we can do this way also//
//        movi.printActor();
    }
}
