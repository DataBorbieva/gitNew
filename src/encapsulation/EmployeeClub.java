package encapsulation;

import java.util.Scanner;

public class EmployeeClub {
    public static void main(String[] args) {
        Employee emp = new Employee();

        Scanner inputReader = new Scanner(System.in);
        System.out.println("Hey, what is your name?");
        emp.setFullName(inputReader.nextLine());



        System.out.println("And the age please?");
        emp.setAge(inputReader.nextInt());
        inputReader.nextLine();

        System.out.println("Lastly, address please?");
        emp.setAddress(inputReader.nextLine());
        System.out.println(emp);  //Employee{fullName='Data Borbieva', age=23, address='123 Main Street , Grove , 800099', phone='null'}

        if(emp.getAddress().toLowerCase().contains("chicago") && emp.getAge() > 21){
            System.out.println(emp.getFullName() + "is in the club");
        }
        else{
            System.out.println(emp.getFullName() + "is not in the club");
        }
    }
}
