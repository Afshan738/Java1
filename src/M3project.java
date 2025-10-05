
// THE NUMBER GUESSING GAMEEE😁
import java.util.Scanner;
import java.util.Random;

public class M3project {

    public static void main(String[] args) {
        // firstly i will write the code to generate the random num
        Random Random_num = new Random();

        int myRandom = Random_num.nextInt(100) + 1;
        int user_num;
        Scanner gameScanner = new Scanner(System.in);
        System.out.println("WELCOME TO Casino number Guessing Game-----");
        System.out.println("Enter a number plzz");
        do {

            user_num = gameScanner.nextInt();
            if (myRandom == user_num) {
                System.out.println("Yahooooo your guess is correct");
            } else if (myRandom > user_num) {
                System.out.println("Sorry😐 plzz enter the large number");
            } else {

                System.out.println("Sorry😞 plzz enter the small number");
            }
        } while (user_num != myRandom);
        gameScanner.close();
    }

}

// All done for the module 3😎
