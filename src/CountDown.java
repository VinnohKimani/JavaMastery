import java.util.Scanner;
class CountDown{
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int start = 0;
        System.out.print("How many seconds to start count down from? ");
        start = scanner.nextInt();

        for(int i = start; i > 0; i--){
            System.out.println(i);
            Thread.sleep(1000);
        }
        System.out.println("HAPPY BIRTHDAY!");
    }
}