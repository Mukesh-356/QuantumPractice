import java.util.Scanner;
public class Long
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();

		HashSet<Character> win=new HashSet<>();
		int l=0;
		int r=0;
		int max=0;

		while(r<str.length()) {
			char ch=str.charAt(r);

			if(!win.contains(ch)) {
				win.add(ch);
				max=Math.max(max, r-l+1);
				r++;
			}
			else {
				win.remove(str.charAt(l));
				l++;
			}
		}

		System.out.println(max);
	}
}