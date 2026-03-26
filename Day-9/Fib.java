import java.util.Scanner;
public class Fib{
    public static int fibon(int n) 
    {
        if(n==0){ 
            return 0;
        }
        if(n==1) {
            return 1;
        }
        
        return fibon(n-1)+fibon(n-2);
    }
  public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibon(n));
    }
}