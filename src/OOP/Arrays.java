package OOP;
import java.util.Scanner;

class Arrays{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String target;
        boolean isFound = false;
        String [] fruits = {"apple", "orange", "banana", "pineapple"};


//        System.out.println(fruits[0]);

//        for(int i = 0; i < fruits.length; i++ ){
//            System.out.println(fruits[i]);
//        }

//        Enhanced for loop
//        For every fruit in my array of fruits do this: ...
        for(String fruit: fruits){
            System.out.println(fruit);
        }
        System.out.print("\n Enter the element to search for: ");
        target = scanner.nextLine();

//        String newTarget = Integer.toString(target);
        for(int i = 0; i < fruits.length; i++){
            if(fruits[i].equals(target)){
                System.out.print("\nElement found at index: " + i);
                isFound = true;
                break;
            }
        }
        if(!isFound){
            System.out.println("Element not found in the array!");
        }


        String[] foods;
        int size;

        System.out.print("\nWhat number of food do you want: ");
        size = scanner.nextInt();
        scanner.nextLine();
        foods = new String[size];

        for(int i =0; i < foods.length; i++){
            System.out.print("Enter the food you want: ");
            foods[i] = scanner.nextLine();
        }

        for(String food: foods){
            System.out.println(food);
        }



    }
}