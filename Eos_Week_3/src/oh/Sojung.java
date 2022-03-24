package oh;
import java.util.Scanner;

public class Sojung {
    public static void main(String[] args) {
        String[] sentence = {"사과", "너무", "맛없어"};

        int[] number = new int[7];

        for(int i = 0; i < number.length; i++){
            number[i] = 7*(i + 1);
        }

        for(String word: sentence){
            System.out.println(word);
        }
        System.out.println("-----------------");

        for(int i = 0; i < number.length; i++){
            System.out.println(number[i]);
        }
    }
}
