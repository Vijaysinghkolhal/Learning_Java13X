package TernaryOperator;

public class oddNumber
{
    public static void main(String[] args)
    {
        // Check whether a number is even or odd using ternary operator
        int a=7;
        String num=(a%2==0) ?"Even":"odd";
        System.out.println(num);

//If we use"/" then this means Division, if we use "%" this means Remainder.
        int b=41;
        String num1=(b%2==0) ? "Even":"odd";
        System.out.println(num1);

   }
}
