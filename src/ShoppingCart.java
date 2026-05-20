import java.util.Scanner;

class ShoppingCart{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String item, currency ="KSH";
        double quantity, price, total;

        System.out.println("----Shopping Cart---- ");
        System.out.print("What item would you like to buy?: ");
        item = scanner.nextLine();
        System.out.print("What is the price for each: ");
        quantity = scanner.nextDouble();
        System.out.print("How many would you like: ");
        price = scanner.nextDouble();

        total = price * quantity;

        System.out.println(" ");
        System.out.println("The total price of: " + quantity + " of " + item + " is: " + currency +" " + total);

        scanner.close();
    }
}