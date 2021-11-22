package inhert;

public class Main {

    public static void main(String[] args) {
        int rows = 4;
        char number = 'A';

        for(int i = 1; i <= rows; i++) {

            for(int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }

            System.out.println();
        }
    }
}
