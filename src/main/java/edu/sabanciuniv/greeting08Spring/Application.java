package edu.sabanciuniv.greeting08Spring;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {

        BeanFactory factory = new ClassPathXmlApplicationContext("edu/sabanciuniv/greeting08Spring/beans.xml");

        GreetingRenderer renderer = (GreetingRenderer) factory.getBean("renderer");
        renderer.render();

    }
}
