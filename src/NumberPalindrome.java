public class NumberPalindrome {
    public static boolean isPalindrome(int number){
        int reverse = 0;
        int startingNumber = number;
        if (startingNumber < 0){
            startingNumber *= -1;
            number *= -1;
        }
        while (number > 0){
            int digit = number % 10;
            number /= 10;
            reverse *= 10;
            reverse += digit;
        }
        if (reverse == startingNumber){
            return true;
        }
        return false;
    }
}
