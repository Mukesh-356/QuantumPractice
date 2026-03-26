import java.util.Scanner;
public class Max 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        int max=arr[0];
        int smax=arr[0];

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax&&arr[i]!=max)
            {
                smax=arr[i];
            }
        }
        
        System.out.println(smax);
    }
}