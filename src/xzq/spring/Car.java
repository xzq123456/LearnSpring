package xzq.spring;
//使用构造器注入
public class Car {
    private  String brand;
    private String  corp;
    private  double price;
    private int maxSpeed;

    public Car() {
    }
    public Car(String brand, String corp, int maxSpeed) {
        this.brand = brand;
        this.corp = corp;
        this.maxSpeed = maxSpeed;

    }
   //初始化了三个属性
    public Car(String brand, String corp, double price) {
        this.brand = brand;
        this.corp = corp;
        this.price = price;

    }
    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", corp='" + corp + '\'' +
                ", price=" + price +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
