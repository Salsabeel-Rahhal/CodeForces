import java.util.*;
public class M{
	//capital or small or digit?
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		char x= scan.next().charAt(0);
		if(x>=48&&x<=57)
			System.out.println("IS DIGIT");
		else if(x>=65&&x<=90)
			System.out.println("ALPHA\nIS CAPITAL");
		else if(x>=97&&x<=122)
			System.out.println("ALPHA\nIS SMALL");

		}
	}