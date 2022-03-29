package assignment3;

public class Main {
    public static void main(String[] args) {
        Student s1, s2;

        s1 = new Student(2020042879, 23, "오소정", "컴퓨터소프트웨어");
        s2 = new Student();

        s1.studentInfo();
        System.out.print("\n");
        s2.studentInfo();
    }
}
