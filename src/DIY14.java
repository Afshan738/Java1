
// DIY 14 ....sum and average😴
import java.util.Scanner;

public class DIY14 {
    public static void main(String[] args) {
        Scanner sum_avgScanner = new Scanner(System.in);
        // System.out.print("E")
        int sum = 0;
        float avg = 0;
        int count = 0;
        System.out.println("how many numbers do u want to enter for sum");
        int n = sum_avgScanner.nextInt();
        if (n > 0) {// I am handling edge case here ..as if user will enter just 0 than we will not
                    // move
                    // to the loop

            for (int i = 0; i < n; i++) {
                int num = sum_avgScanner.nextInt();
                count = count + 1;
                sum = sum + num;

            }
        }
        System.out.println("the sum is " + sum);
        if (count > 0) {

            avg = (float) sum / count;
            System.out.println("the average is" + avg);
        }
        sum_avgScanner.close();
    }
}
