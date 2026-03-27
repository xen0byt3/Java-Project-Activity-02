import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReyesLoginSessionLogger {
    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Create date time formatter
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        DateTimeFormatter activityFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy HH:mm");

        // Ask user to enter username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Get current date and time for login
        LocalDateTime loginTime = LocalDateTime.now();

        // Display login information
        System.out.println("\nLogin successful!");
        System.out.println("User: " + username);
        System.out.println("Login time: " + loginTime.format(format));

        // Ask for activity
        System.out.print("\nEnter your activity: ");
        String activity = input.nextLine();

        // Get current date and time for activity
        LocalDateTime activityTime = LocalDateTime.now();

        // Display activity log
        System.out.println("\n----- USER ACTIVITY LOG -----");
        System.out.println("User: " + username);
        System.out.println("Activity: " + activity);
        System.out.println("Activity time: " + activityTime.format(activityFormat));

        // Wait for user to press ENTER
        System.out.print("\nPress ENTER to logout...");
        input.nextLine(); // Wait for ENTER key

        // Get current date and time for logout
        LocalDateTime logoutTime = LocalDateTime.now();

        // Display logout information
        System.out.println("\nLogout successful!");
        System.out.println("User: " + username);
        System.out.println("Logout time: " + logoutTime.format(activityFormat));

        // Close the Scanner
        input.close();
    }
}