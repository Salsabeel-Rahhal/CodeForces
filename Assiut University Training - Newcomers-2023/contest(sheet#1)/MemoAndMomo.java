import java.util.*;
public class MemoAndMomo{
	public static void main(String[]arges){
		Scanner scan=new Scanner (System.in);
		long a= scan.nextLong();
		long b= scan.nextLong();
		long k= scan.nextLong();
		if((a%k==0)&&(b%k==0))
			System.out.println("Both");
		else if((a%k==0)&&(b%k!=0))
			System.out.println("Memo");
		else if((a%k!=0)&&(b%k==0))
			System.out.println("Momo");
		else if((a%k!=0)&&(b%k!=0))
			System.out.println("No One");



		}

	}