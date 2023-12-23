import java.util.*;
public class H{
	//Two numbers
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		double A=scan.nextLong();
		double B=scan.nextLong();
		double z1=(Math.floor(A/B));
		double z2=(Math.ceil(A/B));
		double z3=(Math.round(A/B));
		System.out.printf("floor %d / %d = %d%n",(long)A,(long)B,(long)z1);
		System.out.printf("ceil %d / %d = %d%n",(long)A,(long)B,(long)z2);
		System.out.printf("round %d / %d = %d%n",(long)A,(long)B,(long)z3);


		}
	}