package org.example;

import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("enter a string");
        String response = scanner.nextLine();
        //Tells whether or not what the user entered is a number
        System.out.println( StringUtils.isNumeric(response));
        //Flips the case of the string
        System.out.println( StringUtils.swapCase(response));
        //Reverses the string
        System.out.println( StringUtils.reverse(response));




    }
}