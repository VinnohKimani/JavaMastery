import java.util.Scanner;

class Loops{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        /*
        While loop = repeats the code forever while some condition is true
        * */
        String name = "";

        while(name.isEmpty()){
            System.out.print("Enter your name: ");
            name = scanner.nextLine();
        }

//        Do while loop --> runs the code at least once before the condition is checked
        int age=0;

        do{
            System.out.print("\nEnter you age: ");
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Your age can't be negative!\n");
            }
        }while(age < 0);

        System.out.printf("Hello %s", name);
        System.out.printf("\nYou are %d years old", age);

//        for loop ---> Executes code a certain number of times
        /*
        for(initialisation; condition; update){
           code
        }
        break = Break out of the loop(Stop)
        continue = skip current iteration of the loop(SKIP).
        * */
        for(int i = 0; i < 10; i+=5){
            System.out.println("Java is fun");
        }

        System.out.println("\n");

        for(int j = 0; j < 10; j++){
            if(j == 5){
                break;
            }
            System.out.print(j + " ");
        }

        System.out.println("\n");

        for(int k = 0; k < 10; k++){
            if(k == 5){
                continue;
            }
            System.out.print( k +" ");
        }


        scanner.close();
    }
}