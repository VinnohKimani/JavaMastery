import java.util.Scanner;

class MathOperations{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);

        double radius, circumference, area, volume;

        System.out.print("Enter the radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * Math.PI * radius;
        area = Math.PI * Math.pow(radius, 2);
        volume = 4.0/3.0 * Math.PI * Math.pow(radius, 3);

        System.out.printf("The Circumference is: %.2f cm \n", circumference);
        System.out.printf("The Area is: %.2f cm^2 \n", area);
        System.out.printf("The Volume is: %.2f cm^3 \n",  volume);
    }
}