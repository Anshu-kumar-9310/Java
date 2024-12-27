package Question98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {

    public static void main(String[] args) {
        System.out.println("Welcome in the world of Map.");

        // make a map
        Map<String,String> countryDetail = new HashMap<>();

        // add item in map
        countryDetail.put("India","New Delhi");
        countryDetail.put("Pakistan","Islamabad");
        countryDetail.put("China","Beijing");
        countryDetail.put("Sri Lanka","Colombo");
        countryDetail.put("Bangladesh","Dhaka");

        // get country name from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your Country name: ");
        String country = input.nextLine();

        //check Condition
        if (countryDetail.containsKey(country)) {
            System.out.printf("Capital of %s is %s.",country,countryDetail.get(country));
        }else {
            System.out.println("Sorry we don't know.");
        }
    }
}
