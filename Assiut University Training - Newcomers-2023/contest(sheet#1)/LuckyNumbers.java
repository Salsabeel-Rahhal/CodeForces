import java.util.*;
public class LuckyNumbers{
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int x=(n/10);
		int y=(n%10);
		if(x!=0&&y!=0)
		{
			if(x%y==0||y%x==0)
        		System.out.println("YES");
        	else System.out.println("NO");
		}else System.out.println("YES");
	}
}