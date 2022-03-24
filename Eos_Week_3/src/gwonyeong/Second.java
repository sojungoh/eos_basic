package gwonyeong;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        if(n % 2 == 1){
            int spaceNum = (n + 1) / 2;

            for(int i = 1; i <= spaceNum; i++){
                for(int j = 0; j < spaceNum - i; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");

                if(i != 1){
                    for(int j = 0; j < 2*(i - 1) - 1; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.print("\n");
            }

            for(int i = 1; i < spaceNum; i++){
                for(int j = 0; j < i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");

                if(i != spaceNum - 1){
                    for(int j = 0; j < 2*((spaceNum - 1) - i) - 1; j++){
                        System.out.print(" ");
                    }
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        }

        if(n % 2 == 0){
            int spaceNum = n / 2;
            for(int i = 1; i <= spaceNum; i++){
                for(int j = 0; j < i - 1; j++){
                    System.out.print(" ");
                }
                System.out.print("*");

                if(i != spaceNum){
                    for(int j = 0; j < 2*(spaceNum - i); j++){
                        System.out.print(" ");
                    }
                }
                System.out.println("*");
            }

            for(int i = 0; i < spaceNum; i++){
                for(int j = 0; j < spaceNum - (i + 1); j++){
                    System.out.print(" ");
                }
                System.out.print("*");

                for(int j = 0; j < 2*i; j++){
                    System.out.print(" ");
                }
                System.out.println("*");
            }
        }
    }
}