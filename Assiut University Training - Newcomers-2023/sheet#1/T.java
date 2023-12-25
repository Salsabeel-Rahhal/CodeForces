import java.util.*;
public class T{
	public static void main(String[]arges){
		Scanner scan=new Scanner(System.in);
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();

		if(A>=B&&A>=C){
			if(B>=C){
				System.out.printf("%d%n%d%n%d%n%n",C,B,A);
				System.out.printf("%d%n%d%n%d%n",A,B,C);
			}
			else{
				System.out.printf("%d%n%d%n%d%n%n",B,C,A);
				System.out.printf("%d%n%d%n%d%n",A,B,C);}

			}
		if(B>A&&B>=C){
					if(A>=C) {
						System.out.printf("%d%n%d%n%d%n%n",C,A,B);
						System.out.printf("%d%n%d%n%d%n",A,B,C);}
					else {
						System.out.printf("%d%n%d%n%d%n%n",A,C,B);
						System.out.printf("%d%n%d%n%d%n",A,B,C);}

			}
		if(C>A&&C>B){
					if(A>=B){
						System.out.printf("%d%n%d%n%d%n%n",B,A,C);
						System.out.printf("%d%n%d%n%d%n",A,B,C);}

					else {
						System.out.printf("%d%n%d%n%d%n%n",A,B,C);
						System.out.printf("%d%n%d%n%d%n",A,B,C);}

			}
	}

}