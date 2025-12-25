//Q2. Login Authentication System
//
//Scenario:
//A system validates user login credentials.
//
//Rules:
//
//Correct username = admin
//
//Correct password = 12345
//
//If both are correct → “Login Successful”
//
//Else → “Invalid Credentials”
//
//Task:
//Take username and password as input and validate login.
//
//Concepts Tested:
//String, equals(), if-else, input handling

import java.util.Scanner;

public class LoginAuthenticationSystem
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.next();

        System.out.print("Enter password: ");
        String password = sc.next();

        if (username.equals("admin") && password.equals("12345")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }
    }
}
