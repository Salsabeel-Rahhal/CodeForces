import java.util.*;
public class Z{
	//Hard Compare
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		long A=scan.nextLong();
		long B=scan.nextLong();
		long C=scan.nextLong();
		long D=scan.nextLong();
		if(Math.pow(A,B)>Math.pow(C,D))
			System.out.println("YES");
		else
			System.out.println("NO");
		}
	}