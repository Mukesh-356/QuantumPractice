import java.util.*;

class Sub {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int max=Integer.MIN_VALUE;
        int sum=0;

        for (int i=0;i<n;i++) {

            for(int j=i;j<n;j++)
            {

                sum=sum+arr[j];
                if(sum>max)
                {
                    max=sum;
                }
            }

            sum=0;
        
        }
        System.out.print(max);
        
    }
}