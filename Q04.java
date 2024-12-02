import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {


        Scanner newScanObj = new Scanner(System.in);

        System.out.println("Input the string in this form: december 8, 2024");

        // Read the input line from the user
        String dateLine = newScanObj.nextLine();
        // Trim any leading or trailing whitespace from the input
        dateLine = dateLine.trim();
        // Find the position of the first space (separates month from day) and the first comma (separates day from year)
        int firstSpace = dateLine.indexOf(" ");
        int firstComma = dateLine.indexOf(",");
        // Extract the month substring from the input string (from the start to the first space)
        String fStr = dateLine.substring(0, firstSpace);
        // Extract the day substring from the input string (between the space and the comma)
        String secStr = dateLine.substring(firstSpace + 1, firstComma);
        // Extract the year substring from the input string (after the comma)
        String thirdStr = dateLine.substring(firstComma + 2);
        // Get the first character of the month and convert it to uppercase
        char monthFirstCharPosition = fStr.charAt(0);
        String monthFirstChar = Character.toString(monthFirstCharPosition).toUpperCase();
        // Convert the remaining part of the month to lowercase
        String monthOther = fStr.substring(1).toLowerCase();
        // Combine the uppercase first letter and the rest of the lowercase month
        String month = monthFirstChar + monthOther;
        // Ensure that the day string has two digits by adding a leading zero if necessary
        String dateNo = (secStr.length() < 2 ? "0" + secStr : secStr);
        // Print the date in the required format: "year month day"
        System.out.println(thirdStr + " " + month + " " + dateNo);
    }
}
