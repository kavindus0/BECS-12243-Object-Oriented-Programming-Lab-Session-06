public class Q03 {
    public static void main(String[] args) {

        String[][] nameRowList = {{"Amali", "Thilina", "Vihara"}, {"Kamal", "Nimal", "Sunil"}};
        System.out.println("Seat No Student");
        System.out.println("_______ _______");
        int rowNo = 1;
        int colNo = 1;
        for (String[] first : nameRowList) {
            for (String names : first) {
                System.out.println(rowNo +""+ colNo+" "+"\t\t"+names);
                colNo++;
            }
            colNo = 1;
            rowNo++;
        }
    }
}
