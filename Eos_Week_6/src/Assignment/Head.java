package Assignment;

import java.util.Scanner;

public class Head {
    public static void main(String[] args) {
        int pNum, salary, year;
        String name;
        Scanner scan = new Scanner(System.in);
        System.out.println("사람은 몇 명인가요?");
        pNum = scan.nextInt();

        Job[] jobs = new Job[pNum];

        System.out.println("정보를 입력해주세요. 입력이 완료되면 \"끝\"을 입력해주세요.");

        for(int i = 0; i < pNum; i++){
            name = scan.next();
            salary = scan.nextInt();

            if(scan.hasNextInt()){
               year = scan.nextInt();
               jobs[i] = new Programmer(name, salary, year);
               continue;
            }
            jobs[i]  = new Job(name, salary);
        }
        printAll(jobs);
    }

    public static void printAll(Job[] jobs){
        for(Job job: jobs){
            job.printInfo();
            System.out.println("다시 한 번 말하지만");
            job.printInfo();
        }
    }
}
