package xzq.spring.Autowire;

import javax.sound.midi.Soundbank;

public class Car {
    private String brand;
    private double price;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Car(){
        System.out.println("Constructor--------------");
    }
}
