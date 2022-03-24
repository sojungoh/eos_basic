package test;

import java.util.Scanner;

public class Work {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        int number = name.nextInt();
        System.out.println("학번: " + number);
        name.close();
    }
}
