// 09-28-2022 Rev. Drew Brown
// CSCI-C101 § 30187

public class timesTable {
    public static void main(String[] args) {
        System.out.print("  X ");
        for (int n = 1; n < 10; n++) { // header row
            System.out.printf("%3d ", n);
        }
        System.out.println();
        for (int m = 1; m < 10; m++) {
            System.out.printf("%3d ", m); // left column
            for (int n = 1; n < 10; n++) {
                System.out.printf("%3d ", m*n); // times table
            }
            System.out.println("");
        }
    }
}