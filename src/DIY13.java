
// building a multiplication table
// loops🤢
import java.util.Scanner;

public class DIY13 {
    public static void main(String[] args) {

        Scanner tableScanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = tableScanner.nextInt();
        System.out.println("Table of " + number);
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "*" + i + "=" + number * i);
        }
        tableScanner.close();
        // 🧐 all done
    }
}
