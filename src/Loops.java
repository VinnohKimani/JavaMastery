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

//        Do while loop
        int age=0;

        do{
            System.out.print("\nEnter you age: ");
            age = scanner.nextInt();
            if (age < 0) {
                System.out.println("Your age can't be negative!\n");
            }
        }while(age < 0);

        System.out.printf("Hello %s", name);
        System.out.printf("You are %d years old", age);

        scanner.close();
    }
}