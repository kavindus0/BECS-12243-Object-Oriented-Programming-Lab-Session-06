public class Q01 {
    public static void main(String[] args) {
//        Print the following array using for loop and foreach loop and get the sum of all the values
//        stored in the Num array.
        int Num[] = {40, 28, 10, 81, 23, 45, 47, 18, 76, 64};

        int sum = 0;
        for (int i = 0; i < Num.length; i++) {
            sum += Num[i];
        }
        System.out.println("Sum by for loop is " + sum);


        sum = 0;
        for (int i : Num) {
            sum += i;
        }
        System.out.println("Sum by for each is " + sum);

    }
    }

