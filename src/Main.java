//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        double gpa;
        boolean isStudent;

        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        System.out.print("What is your gpa: ");
        gpa = scanner.nextDouble();
        System.out.print("Are you a student (true/false)");
        isStudent = scanner.nextBoolean();


        System.out.println("Hello " + name);
        System.out.println("Your are " + age + " years old");
        System.out.println("Your gpa is: " + gpa);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        scanner.close();
    }
}