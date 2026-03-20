import java.util.Scanner;
public class Search{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);

    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) 
        {
      arr[i]=sc.nextInt();
    }

    int tar=sc.nextInt();
    int lef=0;
    int rig=n-1;

    while(lef<=rig) 
        {
      int ans=(lef+rig)/2;
      if(arr[ans]==tar) 
        {
        System.out.print(ans);
      }

      else if(arr[ans]<tar) 
        {
        lef=ans+1;
      }

      else 
        {
        rig=ans-1;
      }
    }

    System.out.print("Not found");
  }
}