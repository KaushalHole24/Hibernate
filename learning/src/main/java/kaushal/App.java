package kaushal;

import java.util.List;

// import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class App 
{
    public static void main( String[] args )
    {

        // Phone p1 = new Phone();
        // p1.setId(1);
        // p1.setBrand("Apple");
        // p1.setModel("Iphone 15");
        // p1.setStorage(256);

        // Phone p2 = new Phone();
        // p2.setId(2);
        // p2.setBrand("Google");
        // p2.setModel("Pixel 6a");
        // p2.setStorage(64);

        // Phone p3 = new Phone();
        // p3.setId(3);
        // p3.setBrand("Google");
        // p3.setModel("Pixel 9 Pro");
        // p3.setStorage(256);

        // Student s1 = new Student();
        // s1.setRollno(101);
        // s1.setSname("Vaibhav");
        // s1.setSage(25);
        // // s1.setPhone(p1);
        // s1.setPhones(List.of(p1,p3));

        // Student s2 = new Student();
        // s2.setRollno(102);
        // s2.setSname("Vikram");
        // s2.setSage(23);
        // // s1.setPhone(p1);
        // s2.setPhones(List.of(p2));

        // p1.setStudent(s1);
        // p2.setStudent(s1);
        // p1.setStudent(s1);
        // p2.setStudent(s2);
        // p3.setStudent(s1);

        // Laptop l1 = new Laptop();
        // l1.setBrand("Asus");
        // l1.setModel("Rog");
        // l1.setRam(16);

        // Alien a = new Alien();
        // a.setAid(102);
        // a.setName("Vikram");
        // a.setTech("Python");
        // a.setLaptop(l1);

        // Configuration cfg = new Configuration(); 
        // cfg.addAnnotatedClass(kaushal.Student.class);
        // cfg.configure();
        // SessionFactory sf = cfg.buildSessionFactory(); 

// OR -- Just writing it in single line.

        SessionFactory sf = new Configuration()
                            // .addAnnotatedClass(kaushal.Student.class)
                            .addAnnotatedClass(kaushal.Phone.class)
                            // .addAnnotatedClass(kaushal.Alien.class)
                            .configure()
                            .buildSessionFactory();

        Session session = sf.openSession();

// We need transcation only when we are manipulating the data. We dont need it when we are fetching the data from data base
        Transaction transaction = session.beginTransaction();

        // session.persist(a);
// Used when we have to save data in database 
        // session.persist(p1);
        // session.persist(p2);
        // session.persist(p3);
        // session.persist(s1);
        // session.persist(s2);
       
        
        // String data = "Google";
        // List<Phone> phones = session.createQuery("from Phone", Phone.class).getResultList();
        // Query<Phone> query = session.createQuery("from Phone where brand like ?1", Phone.class);
        // query.setParameter(1,data);
        // List<Phone> phones = query.getResultList();

// Example for level 1 and level2 cache         
        Phone p1 = session.find(Phone.class, 2);
        System.out.println(p1);
        // Phone p2 = session.find(Phone.class, 2);
        // System.out.println(p2);

        // Phone phone = session.getReference(Phone.class,2); //Example of lazey loading -> it will only fire query when you use phone.
        // System.out.println(phone); //Example printing the phone

        transaction.commit();

// Used when we have to fetch data from data base;
        // s1 = session.find(Student.class, 2); 
        
// This command is used to update the data in the table . We need transcation for this and need to update where we have created data. 
// it can also be used to save new data .        
        // session.merge(s1);

// Used to delect the record  
        // session.remove(s1);

        session.close();

        Session session1 = sf.openSession();
        Phone p2 = session1.find(Phone.class, 2);
        System.out.println(p2);
        // Student s = session1.find(Student.class, 101);
        // System.out.println(s);
        session1.close();

        sf.close();

        // System.out.println(s1);
    }
}
