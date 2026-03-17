import java.util.Scanner;
public class Reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int re=0;
        
        while(n>0){
            int r=n%10;
            re=re*10+r;
            n=n/10;
            
        }
        System.out.print(re);
    }
}