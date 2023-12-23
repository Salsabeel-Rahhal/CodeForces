import java.util.*;
public class J{
	//Multiples
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		System.out.println((A%B==0||B%A==0)?"Multiples":"No Multiples");
		}
	}