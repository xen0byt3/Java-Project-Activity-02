Activity # 2 Instruction – Java Programming

Good evening @everyone ! Please follow the instructions carefully for our next activity.

1: Study the given Java coding pattern:

import java.util.Scanner;
import java.time.LocalDateTime;

public class LoginSessionLogger {

    public static void main(String[] args) {

        // Create Scanner object to read user input
        Scanner input = new Scanner(System.in);

        // Ask user to enter username
        System.out.print("Enter username: ");
        String username = input.nextLine();

        // Get current date and time
        LocalDateTime loginTime = LocalDateTime.now();

        // Display login information
        System.out.println("\nLogin successful!");
        System.out.println("User: " + username);
        System.out.println("Login date and time: " + loginTime);

        // Close the Scanner
        input.close();
    }

}

2. Create a Java program that simulates a simple user login and activity log system. The program should ask the user to enter information and display a log similar to the example below.

Program Flow Example:

Enter username: adonis

Login successful!
User: adonis
Login time: 2026-03-05 16:45:10

Enter your activity: Upload project to GitHub

----- USER ACTIVITY LOG -----
User: adonis
Activity: Upload project to GitHub
Activity time: 03-05-2026 16:45

Press ENTER to logout...

Logout successful!
User: adonis
Logout time: 03-05-2026 16:46

3. Important Requirement:
Your program must include the following import for formatting the date and time:

import java.time.format.DateTimeFormatter;

4. Then prepare or initialize a date and time formatter using this code:

DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

This formatter will be used to display the login time, activity time, and logout time.

Submission Options:

1. Send the Programiz link of your code (just ping it to my Messenger), OR
2. Upload your .java file to GitHub and add xen0byt3 as a collaborator (recommended) OR
3. Create a pull request of this file (most recommended).

Make sure your program runs correctly before submitting. Good luck and happy coding!