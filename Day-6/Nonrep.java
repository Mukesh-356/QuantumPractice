import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class Nonrep 
{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        Map<Integer,Integer> map=new HashMap<>();
        for(int a:arr){
            map.put(a,map.getOrDefault(a,0)+1);
        }

        for(int a:arr){
            if(map.get(a)==1){
                System.out.println(a);
            }
        }
    }
}