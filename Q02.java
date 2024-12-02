public class Q02 {
    public static void main(String[] args) {
//        2. The two-dimensional array below contains the weights of students in 4 groups:
//        Write a Java program to compute the average weight of students for each group and display
//        the results in the format:
//        Group 1 Average Weight: 50.83
//        Group 2 Average Weight: 58.20
//        Group 3 Average Weight: 52.20
//        Group 4 Average Weight: 57.17
        double[][] weights = {{54.5, 50, 48}, {43, 56.5, 67, 65.5, 59}, {45, 55, 63, 45.5, 54.5}, {66, 49.5, 56}};
        int groupNo = 1;

        for (double[] group:weights) {
            double sum=0;
            double avg=0;
            for (double s:group) {
                sum +=s;
            }
            System.out.print("Group "+groupNo+" Average Height: " );
            System.out.printf("%.2f\n",(sum/ group.length));
            groupNo++;

        }

    }
}
