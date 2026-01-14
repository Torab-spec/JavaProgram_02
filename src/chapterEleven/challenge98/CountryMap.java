package chapterEleven.challenge98;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "Dilli");
        countryMap.put("China", "Brazil");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("SriLanka", "Columbia");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter country name: ");
        String countryName = input.nextLine();

        if (countryMap.containsKey(countryName)) {
            System.out.printf("Capital of %s is %s",countryName, countryMap.get(countryName));

        } else {
            System.out.println("Sorry we don't know the capital of " + countryName);
        }
    }
}
