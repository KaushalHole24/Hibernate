package kaushal;

import java.util.List;

import jakarta.persistence.Entity;
// import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
// import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
// import jakarta.persistence.OneToOne;

@Entity
public class Student {

    @Id
    private int rollno;
    private String sname;
    private int sage;
    // @OneToOne(fetch = FetchType.EAGER)
    // private Phone phone;

// Adding (mappedBy) line it will not create third table     
    @OneToMany(mappedBy = "student")
    private List<Phone> phones; 
    
    // @ManyToMany(mappedBy = "students")
    // private List<Phone> phones; 

    public int getRollno() {
        return rollno;
    }
    public void setRollno(int rollno) {
        this.rollno = rollno;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public int getSage() {
        return sage;
    }
    public void setSage(int sage) {
        this.sage = sage;
    }

// This is for one to one

    // public Phone getPhone() {
    //     return phone;
    // }
    // public void setPhone(Phone phone) {
    //     this.phone = phone;
    // }

// This is for one to many

    public List<Phone> getPhones() {
        return phones;
    }
    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }
    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", sname=" + sname + ", sage=" + sage + ", phones=" + phones + "]";
    }
    
    // @Override
    // public String toString() {
    //     return "Student [rollno=" + rollno + ", sname=" + sname + ", sage=" + sage + ", phone=" + phone + "]";
    // }

    
    
}
