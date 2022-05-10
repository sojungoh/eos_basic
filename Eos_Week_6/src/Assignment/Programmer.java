package Assignment;

public class Programmer extends Job {
    private String name;
    private int salary;
    private int year;

    public Programmer(){
        name = "";
        salary = 0;
        year = 0;
    }

    public Programmer(String name, int salary, int year){
        this.name = name;
        this.salary = salary;
        this.year = year;
    }

    @Override public void printInfo(){
        //super.printInfo();
        int bonus;
        if(year < 5){
            bonus = salary + year*200;
        }
        else{
            bonus = salary + year*400;
        }
        System.out.printf("나는 %d년차 프로그래머 %s, 연봉은 %d이야.\n", year, name, bonus);
    }
}
