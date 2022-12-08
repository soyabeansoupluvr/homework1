public class palindromicPrimeNumber{
    public static void main(String[] args) {
        int count = 0;
        for (int num = 2; count < 50; num++) {
            if( isPrime(num) && isPalindrome(num)) {
                System.out.printf(" %7d", num);
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
        @param div divsor for checking if prime
        */
        for (int div = 2; div <= num / 2; div++) {
            if (num % div == 0)
                return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int num) {
        /**
        Function to check if a number is palindromic.
        */
        return (num == reverseNumber(num));
    }
    
    public static int reverseNumber(int num){
        /**
        Function to reverse the order of a decimal number.
        Used to perform the check of palindromic numbers.
        @param num number to reverse
        @param rev result of calculation
        */
        int rev = 0;
        do {
            rev = rev * 10 + num % 10;
            num = num / 10;
        } while (num > 0);
        return rev;
    }
}