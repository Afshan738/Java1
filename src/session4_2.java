import java.util.Scanner;

public class session4_2 {
    public static void main(String[] args) {
        Scanner login = new Scanner(System.in);
        System.out.println("Enter your email");
        String email = login.nextLine();
        System.out.println("Enter your pasword");
        String Password = login.nextLine();
        if (email.equals("afshanqasim@gmail.com") && Password.equals("once123")) {
            System.out.println("You have successfully logged in");
        } else {
            System.out.println("Invalid email or password");
        }
        login.close();
    }
}
