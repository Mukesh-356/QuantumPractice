import java.util.Scanner;
public class MissingNumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        
        int n=sc.nextInt();
        
        int arr[]=new int[n-1];
        
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        
        int f=n*(n+1)/2;
        
        int t=0;
        
        for(int i=0;i<arr.length;i++){
            t+=arr[i];
        }
        
        int m=f-t;
        System.out.print(m);
    }
}