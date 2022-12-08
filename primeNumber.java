public class primeNumber{
    public static void main(String[] args) {
        int count = 0;
        for (int num = 2; count < 50; num++) {
            if (isPrime(num)) {
                System.out.printf(" %4d", num);
                count++;
                if (count % 10 == 0)
                    System.out.println();
            }
        }
    }

    public static boolean isPrime(int num) {
        /**
        Function to check if a number is prime.
        @param num number to check
        @param div divisor for checking if prime
        @param prime arbiter of if the number is prime or not
        */
        boolean prime = true;
        for (int div = 2; div < num; div++) {
            if (num % div == 0) {
                prime = false;
                break;
            }
        }
        if (prime)
            return true;
        else
            return false;
    }
}