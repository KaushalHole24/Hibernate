package kaushal.config;

import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

// import kaushal.Alien;
// import kaushal.Computer;
// import kaushal.Desktop;
// import kaushal.Laptop;


@Configuration
@ComponentScan("kaushal")
public class AppConfig {
    
    // Name of your method is default bean name 
    // We can rename bean using name attribute. We can also give multiple names to bean using array {"abc", "bce"}
    // Prototype -> It id used when we want new object for each refference. When even getbean will be used a new object will be created.
    // Qualifier and Primary are similar ised to avoid confusiion of bean 
   

    // @Bean
    // public Alien alien(@Autowired Computer com){ //@Qualifier("desktop")
    //     Alien obj = new Alien();
    //     obj.setAge(25);
    //     obj.setCom(com);
    //     return obj;
    // }

    //  @Bean(name = "com1")
    // // @Scope("prototype")
    // public Desktop desktop() {
    //     return new Desktop();
    // }

    // @Bean
    // @Primary
    // public Laptop laptop(){
    //     return new Laptop();
    // }

}
