package kaushal;

import org.springframework.stereotype.Component;


// Writing this "lpt" will change the name of bean laptop
@Component
public class Laptop implements Computer{
    
    // Laptop(){
    //     System.out.println("Inside Laptop...");
    // }

    @Override
    public void compile(){
        System.out.println("Code is Compiling in Laptop..");
    }
}
