import java.util.*;
public class L{
	//The Brothers
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		String p1=scan.nextLine();
		String p2=scan.nextLine();
		scan.close();
		int l=p1.length()-1;
		String[] p3= p1.split(" ");
		String[] p4= p2.split(" ");
		System.out.println(p3[1].equals(p4[1])?"ARE Brothers":"NOT");


		}
	}