package OOP;

public class Users {
    static int numberOfUsers;
    String username;
    String email;
    int age;

    Users(String username, String email){
        this.username = username;
        this.email = email;
        numberOfUsers++;

    }
    Users(String username, String email, int age){
        this.username = username;
        this.email = email;
        this.age = age;
        numberOfUsers++;
    }
    static void showNumberOfUsers(){
        System.out.println("You have: " + numberOfUsers + " users in your application.");
    }
}
