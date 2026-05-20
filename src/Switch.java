import java.util.Scanner;

class Switch{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String day;

        System.out.print("Enter the day: ");
        day = scanner.nextLine();

        switch(day){
            case "Monday" -> System.out.println("It's a week day");
            case "Tuesday" -> System.out.println("It's a week day");
            case "Wednesday" -> System.out.println("It's a week day");
            case "Thursday" -> System.out.println("It's a week day");
            case "Friday" -> System.out.println("It's a week day");
            case "Saturday" -> System.out.println("It's a weekend");
            case "Sunday" -> System.out.println("It's a weekend");

            default -> System.out.printf("%s Is not a day!", day );
        }
    }
}