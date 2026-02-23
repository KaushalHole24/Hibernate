package kaushal;

// import java.util.List;

import jakarta.persistence.Cacheable;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
// import jakarta.persistence.ManyToOne;

@Entity
@Cacheable
public class Phone {
    
    @Id
    private int id;
    private String brand;
    private String model;
    private int storage;

// We have written this so that third table is not created 
    // @ManyToOne
    // private Student student;

    // @ManyToMany
    // private List<Student> students; 

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    // public Student getStudent() {
    //     return student;
    // }
    // public void setStudent(Student student) {
    //     this.student = student;
    // }
    
    
    @Override
    public String toString() {
        return "Phone [id=" + id + ", brand=" + brand + ", model=" + model + ", storage=" + storage + "]";
    }
    // public List<Student> getStudents() {
    //     return students;
    // }
    // public void setStudents(List<Student> students) {
    //     this.students = students;
    // }

    
    
}
