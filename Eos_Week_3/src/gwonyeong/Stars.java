package gwonyeong;
import java.util.Scanner;

public class Stars {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        //1번
        System.out.println("----------1번----------");
        for(int i = 1; i < n + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //2번
        System.out.println("----------2번----------");
        for(int i = 0; i < n; i++){
            for(int j = n; j > i; j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //3번
        System.out.println("----------3번----------");
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //4번
        System.out.println("----------4번----------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //5번
        System.out.println("----------5번----------");
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //6번
        System.out.println("----------6번----------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //7번
        System.out.println("----------7번----------");
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*i - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //8번
        System.out.println("----------8번----------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - (i + 1); j++){
                System.out.print(" ");
            }
            for(int j = 0; j < 2*(i + 1) - 1; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //9번
        System.out.println("----------9번----------");
        for(int i = 1; i <= n; i++){
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*i - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //10번
        System.out.println("----------10번----------");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*(n - i) - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i = 1; i < n; i++){
            for(int j = 0; j < n - (i + 1); j++){
                System.out.print("*");
            }
            for(int j = 0; j < 2*(i + 1) - 1; j++){
                System.out.print(" ");
            }
            for(int j = 0; j < n - (i + 1); j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
