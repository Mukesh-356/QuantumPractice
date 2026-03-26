import java.util.Scanner;
public class Fac{ 
    public static int factorial(int n)
    {
        if(n==0)
        {
            return 1;
        }
        return n*factorial(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev=factorial(n);
        System.out.println(rev);
    }
}
