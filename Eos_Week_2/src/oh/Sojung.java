package oh;
import java.util.Scanner;
public class Sojung {
    public static void main(String[] args) {
        String kimkyeongmin = "김경민";
        String jungjina = "정지나";
        System.out.println("멘토 1 : " + kimkyeongmin + ", 멘토 2 : " + jungjina);

        Scanner scan = new Scanner(System.in);
        String name = scan.next();
        int number = scan.nextInt();
        System.out.println("이름 : " + name);
        System.out.println("학번 : " + number);
        scan.close();
    }
}
