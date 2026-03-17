import java.util.Arrays;
import java.util.Scanner;
public class Second {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int len=arr.length;
        int lar=arr[len-1];

        for(int i=n-2;i>=0;i--){
            if(arr[i]!=lar){
                System.out.print(arr[i]);
                return;
            }
        }



    }
}
