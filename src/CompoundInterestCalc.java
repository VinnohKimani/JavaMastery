import java.util.Scanner;

class CompundInterestCalc{
    public static void main(String[] args){
//        Compund interest calculator
        Scanner scanner = new Scanner(System.in);
        String currency = "KSH";
        int timesCompounded, years;
        double principal, rate, amount;

        System.out.print("Enter the principal ammount: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the rate in %: ");
        rate = scanner.nextDouble() / 100;
        System.out.print("Enter the time to be compunded: ");
        timesCompounded = scanner.nextInt();
        System.out.print("Enter the years: ");
        years = scanner.nextInt();

        amount = principal *  Math.pow(1 + rate/ timesCompounded, timesCompounded * years);

        System.out.printf("The amount after %d is %s %.2f", years,currency, amount);

        scanner.close();
    }
}