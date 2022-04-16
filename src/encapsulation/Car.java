package encapsulation;

public class Car {

    //instance variables
    public String make;
    private int year;
    private double price; //require a password    //indirect access
    private boolean isConvertible = true;

    //Providing indirect access to year to set and get info
    public void setYear(int year){ //static method
        this.year = year;
    }

    public int getYear(){
        return this.year;
    }

    //Writing - setting info
    public void setPrice(double price,String adminPassword) { //static method
        if(adminPassword.equals("abcd1234"))this.price = price;
        else throw new RuntimeException("The password entered is not valid!!!");
    }

    //Reading - getting info
    public double getPrice(){
        return this.price;
    }

    public boolean getIsConvertible(){
        return isConvertible;
    }

}

