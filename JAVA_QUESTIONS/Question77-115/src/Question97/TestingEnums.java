package Question97;



public class TestingEnums {

    public static void main(String[] args) {

        System.out.println("Welcome in the world of Print Enums with Attributes.");

        for (Day day : Day.values()) {
            System.out.printf("%s--> %s\n",day,day.getDayType());
        }
    }
}
