package com.java101;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double temperature;//as centigrade
        Scanner input = new Scanner(System.in);
        System.out.print("Please type temperature as centigrade :");
        temperature = input.nextDouble();
        String suggestion = "";
        if (temperature < 5 || temperature > 25) {
            suggestion = temperature < 5 ? "Go Skiing !" : "Go Swimming";
        } else {
            suggestion = (temperature < 15 && temperature > 10) ? "Catch a Movie\nOr\nGo to picnic" : "";
            if (temperature > 10 && suggestion.equals("")) {
                suggestion = "Go to picnic";
            } else if (suggestion.equals("")) {
                suggestion = "Catch a Movie";
            }
        }
        System.out.print(suggestion);
    }
}
