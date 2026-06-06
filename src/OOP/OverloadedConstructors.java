package OOP;

class OverloadedConstructors{
    public static void main(String []  args){
    Users user1 = new Users("Kimani", "kimani@gmail.com");
    Users user2 = new Users("Vincent", "vincent@gmail.com", 20);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
    }
}