package kaushal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Value("21")
    private int age;
    // private Laptop laptop;
    
    private Computer com;

    public Alien(){
        System.out.println("Object Created");
    }

    // Alien(int age, Laptop laptop){
    //     this.age = age;
    //     this.laptop = laptop;
    // }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // public Laptop getLaptop() {
    //     return laptop;
    // }
    // public void setLaptop(Laptop laptop) {
    //     this.laptop = laptop;
    // }

    @Autowired
    @Qualifier("laptop")
    public Computer getCom() {
        return com;
    }
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code(){
        System.out.println("I am coding....");
        // laptop.compile();
        com.compile();
    }
}
    



    
