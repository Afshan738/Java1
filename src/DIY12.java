
// Passowrd retries🥱
import java.util.Scanner;

public class DIY12 {
    public static void main(String[] args) {
        Scanner PassowrdSacnner = new Scanner(System.in);
        String predefinedPassowrd = "Beseonkalagel123";
        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter your Password");
            String user_password = PassowrdSacnner.nextLine();
            if (predefinedPassowrd.equals(user_password)) {
                System.out.println("Login Successful");
                break;
            }
            int remaining_attempts = 3 - i;
            System.out.println("You Entered the wrong password");
            if (remaining_attempts > 0) {
                System.out.println("just " + remaining_attempts + " attempts left");
            }
            // 😑
        }
    }
}
