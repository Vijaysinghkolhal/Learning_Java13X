package TernaryOperator;

public class PassFail
{
    public static void main(String [] args)
    {
        //Check pass or fail
        int A=45;
        String result=(A>=40) ? "Pass":"fail";
        System.out.println(result);

        //Find largest of three numbers (nested ternary)
        int a = 190, b = 125, c = 915;
        int largest=(a>b)? (a>c?a:c):(b>c?b:c);
        System.out.println(largest);

        //Find smallest of three numbers (nested ternary)
        int a1=134, b1=41, c1=67;
        int smallest=(a1<b1)?(a1<c1?a1:c1):(b1<c1?b1:c1);
        System.out.println(smallest);

        int num = -5;

        String result1= (num > 0) ? "Positive": (num < 0) ? "Negative" : "Zero";

        System.out.println(result1);

    }
}
