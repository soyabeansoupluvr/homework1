// 09-23-2022 Rev. Drew Brown
// CSCI-C101 § 30187

public class prime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int count = 0;
        for (int num = 2; count < 50; num++) {
            for (int div = 2; div < num; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
                else
                    isPrime = true;
            }
            if (isPrime) {
                System.out.printf("%4d ", num);
                if (count % 10 == 9)
                    System.out.println("");
                count++;
            }
        }
    }
}