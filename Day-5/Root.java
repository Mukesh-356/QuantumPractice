import java.util.Scanner;
public class Root{
  public static void main(String args[]) 
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int lef=1;
    int rig=n;
    int r=0;

    while(lef<=rig) {
      int mid=(lef+rig)/2;
      if(mid*mid<=n) 
        {

        r=mid;
        lef=mid+1;
      }

      else
         {
        rig=mid-1;
      }

    }
    System.out.print(r);
  }
}