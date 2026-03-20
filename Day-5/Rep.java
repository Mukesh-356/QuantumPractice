import java.util.Scanner;
import java.util.HashSet;
public class Rep{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];

    for(int i=0;i<n;i++){
      arr[i]=sc.nextInt();
    }

    HashSet<Integer> set=new HashSet<>();
    for(int i=0;i<n;i++){
      if(set.contains(arr[i])) 
        {

        System.out.print(arr[i]);
      }
      set.add(arr[i]);
    }
    System.out.print("No repeat");
  }
}