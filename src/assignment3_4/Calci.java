/**
 if else check
 * 
 */


package assignment3_4;
import java.util.Scanner;

public class Calci {
	static String kalculate(Double fn,String opr,Double ln){
		Double output=0.0;
		String noutput;
System.out.println("operator "+opr);
		if(opr=="+"){output=fn+ln;}else
		if(opr=="-"){output=fn-ln;}else
		if(opr=="*"){output=fn*ln;}else
		if(opr=="/"){output=fn/ln; System.out.println("here in 14");
		}else{System.out.println("No match in operator");}
		noutput=" "+output;
		
		return noutput;
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner inputReader = new Scanner(System.in);
		//System.out.println("Enter First Number :");
		Scanner scnr=new Scanner(System.in);
		System.out.println("Enter First Number :");
		String fns=scnr.nextLine();
		Double fn=Double.parseDouble(fns);
		
		//Double fn=Double.parseDouble(args[0]);
		
		System.out.println("Enter the Arithmetic operator :\\n + for addition//n - for Subtraction//n * for Multiplication//n / for Division");
		String opr=scnr.nextLine();
		//Double fn=Double.parseDouble(fns);
		
		//String opr=args[1];
		System.out.println("Enter Next Number :");
		String lns=scnr.nextLine();
		Double ln=Double.parseDouble(lns);
		
		
		//Double ln=Double.parseDouble(args[2]);
		String output=kalculate(fn, opr, ln);//"test output";
		System.out.println(fn+" "+opr+" "+ln+" = "+output);
	}

}
