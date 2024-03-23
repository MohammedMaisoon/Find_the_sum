package codeoftheday;
public class Sum {
    static void sum(int inputNumber) {
        // Creating a copy of input number
        int copyOfInputNumber = inputNumber;
        int sum = 0;

        // Initializing sum to 0
        while (copyOfInputNumber != 0) {
            int lastDigit = copyOfInputNumber % 10;

            // Getting last digit of the input number

            // Adding last digit to sum
            sum += lastDigit;
            // Removing last digit from the input number
            copyOfInputNumber /= 10;
        }
        // Printing sum
        System.out.println("Sum Of All Digits In " + inputNumber + " = " + sum);
    }

    public static void main(String[] args) {
        sum(123);
        sum(13579);
        sum(79879879);
        sum(13213123);
    }
}