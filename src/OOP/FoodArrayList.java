package OOP;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodArrayList{
    public static void main(String []  args){
        Scanner myScanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();

        System.out.print("Enter the number of food you want to enter: ");
        int numOfFood =  myScanner.nextInt();
        myScanner.nextLine();

        for(int i = 0; i < numOfFood; i++ ){
            System.out.print("Enter food # " + i + " : ");
            String food = myScanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        myScanner.close();
    }
}