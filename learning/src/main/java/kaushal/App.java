package kaushal;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
        // Student s1 = new Student();
        
        // s1.setRollno(3);
        // s1.setSname("Vaibhav");
        // s1.setSage(25);

        Laptop l1 = new Laptop();
        l1.setBrand("Asus");
        l1.setModel("Rog");
        l1.setRam(16);

        Alien a = new Alien();

        a.setAid(102);
        a.setName("Vikram");
        a.setTech("Python");
        a.setLaptop(l1);

        // Configuration cfg = new Configuration(); 
        // cfg.addAnnotatedClass(kaushal.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory(); 

// OR -- Just writing it in single line.
        SessionFactory sf = new Configuration()
                            // .addAnnotatedClass(kaushal.Student.class)
                            .addAnnotatedClass(kaushal.Alien.class)
                            .configure()
                            .buildSessionFactory();

        Session session = sf.openSession();

// We need transcation only when we are manipulating the data. We dont need it when we are fetching the data from data base
        Transaction transaction = session.beginTransaction();

        session.persist(a);
// Used when we have to save data in database 
        // session.persist(s1);
        transaction.commit();

// Used when we have to fetch data from data base;
        // s1 = session.find(Student.class, 2); 
        
// This command is used to update the data in the table . We need transcation for this and need to update where we have created data. 
// it can also be used to save new data .        
        // session.merge(s1);

// Used to delect the record  
        // session.remove(s1);

        session.close();
        sf.close();

        // System.out.println(s1);
    }
}
