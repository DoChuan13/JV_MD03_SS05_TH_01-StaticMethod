package StaticMethod;

public class Main {
    public static void main(String[] args) {
        Student.change();

        //Create Student 1
        Student s1 = new Student(111, "Chuan");
        Student s2 = new Student(222, "Thu");
        Student s3 = new Student(333, "Vuong");

        //Call Display
        s1.display();
        s2.display();
        s3.display();
    }
}
