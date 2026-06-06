package OOP;

import OOP.Student;

class Constructors{
    public static void main(String [] args){

//constructor is a special method to initialize objects
    Student student1 =  new Student("Kimani", 20, 4.5, false);

        System.out.println(student1.name);
        System.out.println(student1.age);
        System.out.println(student1.gpa);
        System.out.println(student1.isEnrolled);
        student1.study();

    }
}
