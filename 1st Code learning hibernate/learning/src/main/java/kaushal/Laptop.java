package kaushal;

import jakarta.persistence.Embeddable;

// This keywork will allow hibernate to save laptop details in alien_table. 
// Instead of creating new table for laptop
@Embeddable
public class Laptop {
    
    private String brand;
    private String model;
    private int ram;

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
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public String toString() {
        return "Laptop [brand=" + brand + ", model=" + model + ", ram=" + ram + "]";
    }

    
}
