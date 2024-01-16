package org.example;
import java.util.Scanner;
/**
 * Hello world!
 *
 */
public class Main
{
    // simple comment
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        boolean isValid = false;
        while(!isValid){
           System.out.print("Enter the password: ");
           String password = scanner.nextLine();
           PasswordChecker passwordChecker = new PasswordChecker();

           boolean res =   passwordChecker.checkPassword(password);
            if (res)
             isValid = true;System.out.print("Enter the password: ");
        String password = scanner.nextLine();
        PasswordChecker passwordChecker = new PasswordChecker();

        }

    }
}
