package Assignment;

public class Job {
    private String name;
    private int salary;

    public Job(){
        name = "";
        salary = 0;
    }
    public Job(String name, int salary){
        this.name = name;
        this.salary = salary;
    }

    public void printInfo(){
        System.out.printf("나는 %s, 연봉은 %d이야.\n", name, salary);
    }
}
