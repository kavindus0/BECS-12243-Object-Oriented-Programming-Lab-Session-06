import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
//        Write a program to check whether the entered character is a lowercase letter (a to z) or an
//        uppercase letter (A to Z). If the character is lowercase, convert it to uppercase. If it is
//        uppercase, convert it to lowercase. If the input is not an alphabet, display an appropriate
//        message.
//                If the user input is,
//        a - You entered a lowercase letter "a". Converted to uppercase: "A"
//        D - You entered an uppercase letter "D". Converted to lowercase: "d"
//        @ - You entered "@", which is not an alphabet.
        Scanner scanObj = new Scanner(System.in);
        String enteredOne = scanObj.next();
        char newChar = enteredOne.charAt(0);
        if (Character.isUpperCase(newChar)){
            System.out.println("You entered a uppercase letter "+newChar+". Converted to lowercase: "+Character.toLowerCase(newChar));
        }
        else if(Character.isLowerCase(newChar)){
            System.out.println("You entered a lowercase letter "+newChar+". Converted to uppercase: "+Character.toUpperCase(newChar));
        }
        else {
            System.out.println("You entered \""+newChar+"\", which is not an alphabet.");
        }

    }
}
