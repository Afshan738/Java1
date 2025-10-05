import java.util.Scanner;

public class session5_1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Enter a color from red ,green or Yellow");
        String color = inputScanner.nextLine();
        if (color.equals("red")) {
            System.out.print("Stop");
        } else if (color.equals("yellow")) {
            System.out.print("Slow down");
        } else if (color.equals("red")) {
            System.out.print("Go");
        } else {
            System.out.print("Enter a valid color from red ,green or yellow");
        }
        inputScanner.close();
    }
}
