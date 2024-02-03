public class Main {
    public static void main(String[] args)
    {
        double creditCardBalance = 5000.00; // Credit card balance variable set to 5000
        double interestAfterOneMonth = 0; // Initialize interest after one month double variable
        double interestAfterTwoMonths = 0; // Initialize interest after two months double variable
        interestAfterOneMonth = creditCardBalance * (0.17); // Set the interest after one month variable to 17% of the credit card balance
        interestAfterTwoMonths = (creditCardBalance + interestAfterOneMonth) * (0.17); // Set the interest after two months variable to 17% of the one-month interest added to the credit card balance
        System.out.println("The credit card balance is " + creditCardBalance); // Output the credit card balance
        System.out.println("The interest after one month is " + interestAfterOneMonth); // Output the interest after one month
        System.out.println("The interest after two months is " + interestAfterTwoMonths); // Output the interest after two months
    }
}