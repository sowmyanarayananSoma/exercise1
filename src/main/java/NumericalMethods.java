public class NumericalMethods {
    public int square(int num){
        return num*num;
    }
    public int palindrome(int num){
        int reversed = 0;

        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}
