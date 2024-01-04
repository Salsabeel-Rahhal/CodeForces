import java.util.*;
public class NextAlphabet{
	public static void main(String[]arges){
		Scanner scan=new Scanner (System.in);
		char c=scan.next().charAt(0);
		int x=(int)(c);
		if(c=='z')
			x=96;
		System.out.println((char)(x=x+1));



		}

	}