import java.util.Scanner;
class Zero{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i]=sc.nextInt();
        }

        int m=0;
        for(int i=0;i<n;i++) {
            if(arr[i]!=0){
                int tem=arr[i];
                
                arr[i]=arr[m];
                arr[m]=tem;
                m++;
            }
        }

        for(int num:arr) 
            {
            System.out.print(num+" ");
        }
    }
}