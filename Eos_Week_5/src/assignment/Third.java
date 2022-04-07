package assignment;
import java.util.Scanner;

public class Third {
    public static void main(String[] args) {
        int[] lengths = new int[3];
        char[] letter = new char[3];

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < 3; i++){
            lengths[i] = scan.nextInt();
            letter[i] = scan.next().charAt(0);
        }

        Square one, two, three;

        one = new Square(lengths[0], letter[0]);
        two = new Square(lengths[1], letter[1]);
        three = new Square(lengths[2], letter[2]);

        one.printSquares(one, two, three);
    }
}
