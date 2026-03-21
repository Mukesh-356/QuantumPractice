import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        int tar=sc.nextInt();
        int l=0; 
        int r=n-1;

        while(l<r){
            int c=arr[l]+arr[r];
            if(c==tar){
                System.out.println(l+" "+r);
                break;
            }
            else if(c<tar){
                l++;
            }
            else{
                r--;
            }
        }
    }
}