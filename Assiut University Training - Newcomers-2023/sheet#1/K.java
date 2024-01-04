import java.util.*;
public class K{
	//Max and Min
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int max=0,min=0;

		if(A>=B&&A>=C){
			max=A;
			if(B>=C)
			System.out.println(B>=C?(min=C)+" "+(max):(min=B)+" "+(max));
		}else if (B>=A&&B>=C){
			max=B;
			System.out.println(A>=C?(min=C)+" "+(max):(min=A)+" "+(max));
			}else if (C>=A&&C>=B){
			max=C;
			System.out.println(A>=B?(min=B)+" "+(max):(min=A)+" "+(max));
			}
		}
	}