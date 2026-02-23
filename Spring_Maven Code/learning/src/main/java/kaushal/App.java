package kaushal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kaushal.config.AppConfig;

// import org.springframework.context.ApplicationContext;
// import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Alien a1 = (Alien) context.getBean("alien");
        System.out.println(a1.getAge());
        a1.code();


        // Desktop dt = context.getBean(Desktop.class);
        // dt.compile();

        // Desktop dt1 = context.getBean(Desktop.class);
        // dt1.compile();

// Configuration using XML File
        
        // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        
        // Alien a1 = (Alien) context.getBean("alien");
        // // System.out.println(a1.getAge());
        // a1.code();    
    }
}
