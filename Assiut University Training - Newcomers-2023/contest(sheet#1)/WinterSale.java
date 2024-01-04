import java.util.*;
import java.text.DecimalFormat;
public class WinterSale{
	public static void main(String[]arges){
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		Scanner scan=new Scanner(System.in);

		double x=scan.nextDouble();
		double p=scan.nextDouble();
		double original=p/(1-x/100);
		double roundedNumber = Double.parseDouble(decimalFormat.format(original));
		System.out.println(roundedNumber);

		}

	}