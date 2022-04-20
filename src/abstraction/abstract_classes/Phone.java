package abstraction.abstract_classes;

public abstract class Phone {
    //the only reason we have abstract classes its to use it with child classes

    public Phone(){ // we should keep zero arg constructor to be able to create new objects in child classes

    }
 //create 4 arg constructor

    public Phone(String brand, String color, int storage, double price) {
        this.brand = brand;
        this.color = color;
        this.storage = storage;
        this.price = price;
    }

    public String brand;
    public String color;
    public int storage;
    public double price;

    //we can define here what every phone should do
    public abstract  void call();

    public abstract void ring();

    public abstract void text();

    public abstract boolean isConvertible();

  /*  public static void main(String[] args) {
        Phone p1 = new Phone(); WE CAN NOT CREATE OBJECTS FROM OBJECT CLASSES
    }
*/

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", storage=" + storage +
                ", price=" + price +
                '}';
    }
}

