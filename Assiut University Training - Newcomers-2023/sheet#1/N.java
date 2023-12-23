import java.util.*;
public class N{
	//char
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		char x= scan.next().charAt(0);
		if(x>=65&&x<=90)
			System.out.println((char)(x+32));
		else if(x>=97&&x<=122)
			System.out.println((char)(x-32));

		}
	}