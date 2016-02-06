/**
 * 
 */
package assignment3_4;

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
		Double fn=Double.parseDouble(args[0]);
		String opr=args[1];
		Double ln=Double.parseDouble(args[2]);
		String output=kalculate(fn, opr, ln);//"test output";
		System.out.println(fn+" "+opr+" "+ln+" = "+output);
	}

}
