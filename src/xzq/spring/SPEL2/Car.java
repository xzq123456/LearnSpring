package xzq.spring.SPEL2;

public class Car {
    private String name;
    private  int price;
    private double typerParameter;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getTyperParameter() {
        return typerParameter;
    }

    public void setTyperParameter(double typerParameter) {
        this.typerParameter = typerParameter;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", typerParameter=" + typerParameter +
                '}';
    }
}
