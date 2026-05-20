import java.util.Scanner;

class TernaryOperator{
    public static void main(String[] args){
//        Ternary operator ? = Return one of two values if condition is true
//        variable = (condition) ? if True : if False
        int score = 76;
        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        System.out.println("-----Temperature conversion program----");
        Scanner scanner = new Scanner(System.in);
        double temp, newTemp;
        String unit;

        System.out.print("Enter the temperature: ");
        temp = scanner.nextDouble();
        System.out.print("Convert the temperature to Celsius or Fahrenheit? (C or F): ");
//        method chaining
        unit = scanner.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5 / 9 : (temp * 5 / 9) + 32;

        System.out.printf("%.1f %s",newTemp, unit);

        scanner.close();
    }
}