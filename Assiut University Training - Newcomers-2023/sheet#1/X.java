import java.util.*;
public class X{
	//Two Intervals
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		String interval=scan.nextLine();
		String [] num=interval.split(" ");
		int op1=Integer.parseInt(num[0]);
		int op2=Integer.parseInt(num[1]);
		int op3=Integer.parseInt(num[2]);
        int op4=Integer.parseInt(num[3]);

        if(op2>=op3)
        	System.out.printf("%d %d%n",op3,op2);
        else
        	System.out.println(-1);





		}
	}