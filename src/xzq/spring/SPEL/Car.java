package xzq.spring.SPEL;

public class Car {
    private String brand;
    private double price;
    private double TyperPerimeter;

    public double getTyperPerimeter() {
        return TyperPerimeter;
    }

    public void setTyperPerimeter(double typerPerimeter) {
        TyperPerimeter = typerPerimeter;
    }

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
                ", TyperPerimeter=" + TyperPerimeter +
                '}';
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public Car(){
        System.out.println("Constructor--------------");
    }
}
