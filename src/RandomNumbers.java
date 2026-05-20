import java.util.Random;

class RandomNumbers{
    public static void main(String [] args){
        Random random = new Random();
        int number1, number2, number3;

        number1 = random.nextInt(1, 7);
        number2 = random.nextInt(1, 7);
        number3 = random.nextInt(1,7);

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
    }
}