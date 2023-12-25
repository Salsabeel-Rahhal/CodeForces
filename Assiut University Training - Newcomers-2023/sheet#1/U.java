import java.util.*;
public class U{
	public static void main(String[]arges){
		Scanner scan=new Scanner(System.in);
		float n=scan.nextFloat();
		if((n-((int)n))==0)
			System.out.println("int "+(int)n);
		else if((n-((int)n) !=0))
			System.out.println("float "+(int)n +" "+(n-(int)n));

	}

}