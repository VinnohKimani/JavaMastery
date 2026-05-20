package OOP;

class Methods{
    public static void main(String[] args){
        /*
        Methods == a block of reusable code that is executed when called
        method names must be descriptive
        methods are unfamiliar with variables that are declared within other methods
        Overloaded methods are methods that share the same name but have different parameters
        * */

        String name = "Piastri";
        int age = 25;

        happyBirthdDay(name, age);
        happyBirthdDay(name, age);
        happyBirthdDay(name, age);

         System.out.println(square(3));
        System.out.println(cube(2));

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        }else{
            System.out.println("You must be 18+ to sign up!");
        }

        System.out.println(add(1, 2));
        System.out.println(add(10, 20, 30));
    }
    static void happyBirthdDay(String name, int age){
        System.out.println("Happy birthday to you!");
        System.out.printf("Happy birthday dear %s!\n", name);
        System.out.printf("You are %d years old\n", age);
        System.out.println("Happy birthday to you!\n");
    }
    static  double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }
    static boolean ageCheck(int age){
        return age >= 18;
    }
    static double add(double a, double b){
        return a + b;
    }
    static double add(double a, double b, double c){
        return a + b + c;
    }
}