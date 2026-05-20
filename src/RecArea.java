import java.util.Scanner;

class RecArea{
    public static void main(String args[]){
        Scanner dimentions = new Scanner(System.in);
        double width, length, area;

        System.out.println("----Calculating the Area of a Rectangle--------");
        System.out.print("Enter the width: ");
        width = dimentions.nextShort();
        System.out.print("Enter the length: ");
        length = dimentions.nextDouble();

        area = length * width;
        System.out.println("The are of the rectangle of dimentions(lenght: " + length + ", width: " + width + ") is: "+ area );

        dimentions.close();
    }
}