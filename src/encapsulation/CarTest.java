package encapsulation;

public class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();

        //Setting info for make
        car1.make = "BMW";  //if we dont give any info for make , we will get default value

        //Getting info of make
        System.out.println(car1.make);//BMW   //null

        //Setting info for year
        car1.setYear(2020); //calling method by object

         //Getting info of year
        System.out.println(car1.getYear()); //2020   //0 default value


        System.out.println("\n-----------------------------------");

     //   car1.setPrice(5000, "hello"); //Exception in thread "main" java.lang.RuntimeException: The password entered is not valid!!!
        System.out.println(car1.getPrice());    // and default value 0.0


        car1.setPrice(8000, "abcd1234");
        System.out.println(car1.getPrice()); //8000.0

        System.out.println("\n-----------------------------------");

        System.out.println(car1.getIsConvertible()); //true








    }
}
