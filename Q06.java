    import java.util.Scanner;
public class Q06 {
            public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter your Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Enter your Gender: ");
            String gender = scanner.nextLine();
            System.out.print("Enter your Weight in kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("Enter your Height in meters: ");
            double height = scanner.nextDouble();
            double bmi = (double) weight / (height*height);
            String category;
            if (bmi < 18.5) {
                category = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                category = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                category = "Overweight";
            } else {
                category = "Obesity";
            }
            // Print the result
            System.out.println("\nHi " + name + "!");
            System.out.println("Here are your details:");
            System.out.println("Age: " + age);
            System.out.println("Gender: " + gender);
            System.out.println("Weight: " + weight + " kg");
            System.out.println("Height: " + height + " m");
            System.out.println("BMI: " + String.format("%.2f", bmi));  // Format BMI to 2 decimal places
            System.out.println("Category: " + category);
        }


}
