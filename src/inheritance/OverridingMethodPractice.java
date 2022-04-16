package inheritance;

public class OverridingMethodPractice {
    public static void main(String[] args) {
        Tester tester = new Tester();

        tester.eat(); //Tester eats , our Person method was overriding in Tester Class
        tester.sleep(); //Tester sleeps
        tester.walk();
        tester.learn();
        tester.code();
    }
}
