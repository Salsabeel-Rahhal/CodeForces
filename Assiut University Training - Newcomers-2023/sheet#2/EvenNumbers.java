import java.util.*;
public class EvenNumbers{
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int i=1;
		int c=0;
		while(i<=n){
			if(i%2==0){
				System.out.println(i);
				c++;
				}
				i++;//update statement

			}
			if(c==0)
				System.out.println(-1);

		}
}