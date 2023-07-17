package assignments;
import java.util.Scanner;
public class PasswordVerifier {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter a password to verify:");
	    String password = scanner.nextLine();
	    if (PasswordVerifier.isValidPassword(password)) {
	        System.out.println("The password is valid.");
	    } else {
	        System.out.println("The password is not valid.");
	    }
	}
	public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUppercase = false;
        for (char pw : password.toCharArray()) {
            if (Character.isUpperCase(pw)) {
                hasUppercase = true;
                break;
            }
        }
        if (!hasUppercase) {
            return false;
        }
        boolean hasDigit = false;
        for (char pw : password.toCharArray()) {
            if (Character.isDigit(pw)) {
                hasDigit = true;
                break;
            }
        }
        if (!hasDigit) {
            return false;
        }
        boolean hasSpecialCharacter = false;
        for (char pw : password.toCharArray()) {
            if (!Character.isLetterOrDigit(pw)) {
                hasSpecialCharacter = true;
                break;
            }
        }
        if (!hasSpecialCharacter) {
            return false;
        }
        return true;
    }
}
//test_1(correct example)
//U6511171@au.edu
//The password is valid.
//test_2(to_see_atleast_8_characters)
//2Ud@
//The password is not valid.
//test_3((to_see_atleast_uppercase)
//goodjob#:3
//The password is not valid.
//test_3.1
//GOODJOB#:3
//The password is not valid.
//test_3.2
//GOODjob#:3
//The password is valid.
//test_3.3
//Goodjob#:3
//The password is valid.
//test_4(to_see_atleast_1_digit)
//1Qwert@yU
//The password is valid.
//test_4.1
//Qwert@yU
//The password is not valid.
//test_4.2
//123Qwert@yU
//The password is valid.
//test_5(at least one symbol from {_,@,#,$,/,&})
//@ujhU9jhsd
//The password is valid.
//test_5.1
//ujhU9jhsd
//The password is not valid.
