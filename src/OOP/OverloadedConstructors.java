package OOP;

class OverloadedConstructors{
    public static void main(String []  args){

        //Static makes a varriable or method belong to that class rather than to any specific object
    Users user1 = new Users("Kimani", "kimani@gmail.com");
    Users user2 = new Users("Vincent", "vincent@gmail.com", 20);
    Users user3 = new Users("Macharia", "Macharia@gmail.com", 23);

        System.out.println(user1.username);
        System.out.println(user1.email);
        System.out.println(user2.username);
        System.out.println(user2.email);
        System.out.println(user2.age);
        System.out.println(user3.username);
        System.out.println(user3.email);
        System.out.println(user3.age);
        System.out.println(Users.numberOfUsers);
        Users.showNumberOfUsers();
    }
}