import java.util.*;
public class O{
	//expression
	public static void main(String[] arges){
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		int index=-1;
		String op=null;
		int op1,op2;
		//search of operator
		if(s.contains("+")){
			op="+";
			index=s.indexOf("+");
		}else if(s.contains("-")){
			op="-";
			index=s.indexOf("-");
		}else if(s.contains("*")){
			op="*";
			index=s.indexOf("*");
		}else if(s.contains("/")){
			op="/";
			index=s.indexOf("/");
		}

		//split the string into parts
		if (op!=null && index!=-1) {
		    String operand1 = s.substring(0,index).trim();
            String operand2 = s.substring(index + 1).trim();
            op1=Integer.parseInt(operand1);
            op2=Integer.parseInt(operand2);


		switch(op){
			case"-":System.out.println(op1-op2);
					break;
			case"+":System.out.println(op1+op2);
					break;
			case"*":System.out.println(op1*op2);
					break;
			case"/":System.out.println(op1/op2);
					break;
			}
		  }
		}
	}