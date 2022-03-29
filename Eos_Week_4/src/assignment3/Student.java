package assignment3;

public class Student {
    int id;
    int age;
    String name;
    String major;

    Student(){
        id = 2022123456;
        age = 20;
        name = "홍길동";
        major = "컴퓨터소프트웨어";
    }

    Student(int Id, int Age, String Name, String Major){
        id = Id;
        age = Age;
        name = Name;
        major = Major;
    }

    public void studentInfo(){
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("전공 : " + major);
    }
}
