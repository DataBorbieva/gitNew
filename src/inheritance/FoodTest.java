package inheritance;

import java.util.ArrayList;

public class FoodTest {
    public static void main(String[] args) {
        Food food1 = new Food();
        food1.name = "sushi";//direct access
        food1.taste = "delicious"; //direct access
        food1.isSpicy = true;


        food1.setOrganic(true); //indirect access


        System.out.println(food1.name);
        System.out.println(food1);
        System.out.println("The food is organic = " +food1.isOrganic());

       Vegetable vegetable1 = new Vegetable();
       vegetable1.name = "parsley";
       vegetable1.taste = "good";
       vegetable1.color = "green";
       vegetable1.setOrganic(true);
       vegetable1.isSpicy = false;

        System.out.println(vegetable1.name); //parsley
        System.out.println(vegetable1.color); //green
        System.out.println("Vegetable is organic? " + vegetable1.isOrganic()); //Vegetable is organic? true
        System.out.println(vegetable1);  //Vegetable{taste='good', name='parsley', isSpicy=false, isOrganic=true, color='green'}

        System.out.println("\n-----------------");
        Vegetable vegetable2 = new Vegetable();
        vegetable2.name = "broccoli";

        System.out.println(vegetable2.name);

        ArrayList<Food> allFoods = new ArrayList<>();
        allFoods.add(food1);
        allFoods.add(vegetable1);
        allFoods.add(vegetable2);
       // allFoods.add("Strawberry") -> its a String and we can not add it
        //but if we change ArrayList<Object> allFoods = new ArrayList<>();
        //we can add String, boolean, char, int

        int countCharacters = 0;
        for (Food food : allFoods) {
           if (food.name.length() > 5) countCharacters++;
        }
        System.out.println(countCharacters);

        System.out.println("\n-------count Task Bonus solution---------\n");
        System.out.println(allFoods.stream().filter(food-> food.name.length() > 5).count());

        }
    }

