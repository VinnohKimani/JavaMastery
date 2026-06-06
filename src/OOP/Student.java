package OOP;

public class Student {
        String  name;
        int age;
        double gpa;
        boolean isEnrolled=true;

        Student(String name, int age, double gpa, boolean isEnrolled){
//                constructor
                this.name = name;
                this.age = age;
                this.gpa = gpa;
                this.isEnrolled= isEnrolled;
        }
        void study(){
                System.out.println(this.name + "is Learning java!");
        }

}
