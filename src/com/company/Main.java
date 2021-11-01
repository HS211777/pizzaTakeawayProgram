package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
public static 	Scanner input = new Scanner(System.in);
public static   ArrayList<String> toppings = new ArrayList<>();
public static double cost = 0.0;
    public static void main(String[] args) {
    boolean valid = false;
    String size= "";
    while (!valid){
        try{
            System.out.println("would you like a small medium or large pizza?");
            size = input.next();
        }
        catch(Exception e){
            System.out.println("Error "+e);
            input.next();
        }
        if(size.equalsIgnoreCase("small")){
            cost = 7.99;
            valid = true;
        }
        else if (size.equalsIgnoreCase("medium")){
            cost = 10.99;
            valid = true;
        }
        else if (size.equalsIgnoreCase("large")){
            cost = 13.99;
            valid = true;
        }
        else{
            System.out.println("please enter a valid size");
        }
    }
    valid = false;
    while(!valid){
        try{
            System.out.println("add a topping (2 free, £1.25 for each additional topping)");
            toppings.add(input.next());
        }
        catch(Exception e){
            System.out.println("error "+e);
            input.next();
        }
        System.out.println("add another? y/n");
        String choice = input.next();
        if(choice.equalsIgnoreCase("n")){
            valid = true;
        }
    }
    int extra = toppings.size()-2;
    for(int i =0; i < extra;i++){
        cost += 1.25;
    }
        System.out.println("That pizza will cost you £"+cost);
    }
}
