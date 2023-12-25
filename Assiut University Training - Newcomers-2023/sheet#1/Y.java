import java.util.*;
import java.math.*;
public class Y{
	//the last 2 digit
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		String interval=scan.nextLine();
		String [] num=interval.split(" ");
		long op1=Integer.parseInt(num[0]);
		long op2=Integer.parseInt(num[1]);
		long op3=Integer.parseInt(num[2]);
        long op4=Integer.parseInt(num[3]);
       /* BigInteger op1=BigInteger.valueOf(num[0]);
        BigInteger op2=BigInteger.valueOf(num[1]);
        BigInteger op3=BigInteger.valueOf(num[2]);
        BigInteger op4=BigInteger.valueOf(num[3]);*/

        BigInteger x=BigInteger.valueOf(op1*op2*op3*op4).remainder(BigInteger.valueOf(100));

        System.out.println(x);
		}
	}