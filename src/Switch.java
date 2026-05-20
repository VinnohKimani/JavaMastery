import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> System.out.println("It's a week day");
            case "Saturday", "Sunday" -> System.out.println("It's a weekend");

            default -> System.out.printf("%s Is not a day!", day );
        }
    }
}