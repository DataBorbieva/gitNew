package encapsulation;

public class CompanyTest {
    public static void main(String[] args) {
        Company company1 = new Company();
        Company company2 = new Company();

        company1.setName("Apple");
        company1.setAddress("California");
        company1.setPhoneNumber("(123) 312 -2345");

        company2.setName("Google");
        company2.setAddress("California");
        company2.setPhoneNumber("(000) 055-5555");

        System.out.println(company1);
        System.out.println(company2);

        System.out.println("Company 1 is -> " + company1.getName() + " - " + company1.getAddress() + " - " + company1.getPhoneNumber());
        System.out.println("Company 2 is -> " + company2.getName() + " - " + company2.getAddress() + " - " + company2.getPhoneNumber());

        System.out.println("Company 1 is = " + "\"" + company1.getName() + "\""  + " and company 2 is = " + "\"" + company2.getName() + "\"" );

    }
}
