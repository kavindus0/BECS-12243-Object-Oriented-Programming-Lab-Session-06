import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
//        Write a Java program to order two user input strings lexicographically. Sample input and
//        output are given below:
//
        System.out.println("Enter first String: ");
        Scanner scanObj = new Scanner(System.in);
        String fString = scanObj.nextLine();
 System.out.println("Enter second String: ");
        String secString = scanObj.nextLine();

String Ordered = (fString.compareTo(secString) <0? fString + ", "+secString:secString + ", "+fString);
        System.out.println(Ordered);

    }

}
