package OOP;


class VarArgs{
    public static void main(String[] args){

        /*Varargs --- allows allows a method to accept varying number of arguments
        * It makes methods mor flexible, no need of overloaded methods
        * java packs the arguments into an array
        * ... are used */

        System.out.println(average(1,2,3,4,5,5,3));


    }
    static double average(double... numbers){
        double sum = 0 ;

        if(numbers.length == 0){
            System.out.println("Numbers cannot be zero!");
        }

        for(double number: numbers){
            sum += number;
        }
        return sum / numbers.length;
    }
}