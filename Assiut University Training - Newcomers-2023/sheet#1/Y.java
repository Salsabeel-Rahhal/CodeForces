import java.util.*;
import java.math.*;
public class Y{
	//The Last 2 Digit's
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        BigInteger op1= scan.nextBigInteger();
        BigInteger op2=scan.nextBigInteger();
        BigInteger op3=scan.nextBigInteger();
        BigInteger op4=scan.nextBigInteger();
        BigInteger res = op1.multiply(op2);
        res = res.multiply(op3);
        res = res.multiply(op4);
 		String x=res.toString();

        if(x.length()>=2){
            System.out.print(x.charAt(x.length()-2));
            System.out.print(x.charAt(x.length()-1));
        }
        else{
            System.out.print(x.charAt(x.length()-1));
        }
    }
}
