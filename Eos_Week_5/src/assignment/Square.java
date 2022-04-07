package assignment;

public class Square {
    int length;
    char letter;

    Square(){
        int length = 1;
        char letter = '*';
    }

    Square(int Length, char Letter){
        length = Length;
        letter = Letter;
    }

    public void printSquares(Square one, Square two, Square three){
        int c = three.length;

        while(c > 0){
            for(int i = 0; i < three.length; i++){
                System.out.print(three.letter);
            }
            for(int i = 0; i < two.length - three.length; i++){
                System.out.print(two.letter);
            }
            for(int i = 0; i < one.length - two.length; i++){
                System.out.print(one.letter);
            }
            c -= 1;
            System.out.print("\n");
        }

        int b = two.length - three.length;

        while(b > 0){
            for(int i = 0; i < two.length; i++){
                System.out.print(two.letter);
            }
            for(int i = 0; i < one.length - two.length; i++){
                System.out.print(one.letter);
            }
            b -= 1;
            System.out.print("\n");
        }

        int a = one.length - two.length;

        while(a > 0){
            for(int i = 0; i < one.length; i++){
                System.out.print(one.letter);
            }
            a -= 1;
            System.out.print("\n");
        }
    }
}
