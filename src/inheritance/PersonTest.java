package inheritance;

import package5.Singer;

import java.util.ArrayList;
import java.util.Arrays;

public class PersonTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Tester tester1 = new Tester(); //we can see everything except private because it is in same package
        Singer singer1 = new Singer(); // we can not see private and default , because 2 different packages
        Dancer dancer1 = new Dancer(); //we can see everything except private DOB and SSN

        person1.fName = "John";
        person1.lName = "Doe";
        person1.age = 45;
        person1.gender = "Male";
        person1.setDOB("01/01/1997");
        person1.setSSN("000-00-0000");

        tester1.fName = "Abe";
        tester1.lName = "Kim";
        tester1.age = 20;
        tester1.gender = "Male";
        tester1.setDOB("01/12/2002");
        tester1.setSSN("111-11-1111");



        singer1.fName = "Kaly";
        singer1.lName = "Ngo";
        singer1.age = 15;
        singer1.gender = "Female";
        singer1.setDOB("05/10/2007");
        singer1.setSSN("222-22-2222");



        dancer1.fName = "Alona";
        dancer1.lName = "Q";
        dancer1.age = 15;
        dancer1.gender = "Female";
        dancer1.setDOB("10/10/2007");
        dancer1.setSSN("333-33-3333");

       // System.out.println(person1); //location from HEAP before @overriden
        System.out.println(person1); //Person{fName='John', lName='Doe', age=45, gender='Male', DOB='01/01/1997', SSN='000-00-0000'}
        System.out.println(tester1);
        System.out.println(singer1); //Singer{fName='Kaly', lName='Ngo', age=15, gender='Female', DOB='05/10/2007', SSN='222-22-2222'}
        System.out.println(dancer1);


        System.out.println("\n---------------------------------------");
        Person person2 = new Person("Jane","Doe", 45, "Female");
        person2.setDOB("01/01/1977");
        person2.setSSN("555-55-5555");
        Tester tester2 =  new Tester("Young","Voo", 45, "Male");
        tester2.setDOB("01/12/2002");
        tester2.setSSN("777-77-7777");
        Dancer dancer2 = new Dancer("B","Q" ,15 ,"Female");
        dancer2.setDOB("10/10/2007");
        dancer2.setSSN("999-99-9999");
        Singer singer2 =new Singer("Jessie ", "J", 15, "Female");
        singer2.setDOB("05/10/2007");
        singer2.setSSN("666-66-6666");

        System.out.println(person2);
        System.out.println(tester2);
        System.out.println(singer2);
        System.out.println(dancer2);


        System.out.println("\n-----------------With ArrayList----------------------");
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person2);
        personList.add(tester2);
        personList.add(singer2);
        personList.add(dancer2);

        personList.forEach(element -> System.out.println(element));

        System.out.println("\n-----------------With Array----------------------");

        Person[] personArr = {person2, singer2, tester2, dancer2};
        for (Person person : personArr) {
            System.out.println(person);

        }






    }
}
