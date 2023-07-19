package exception;

public class NumberformetExc {

	public static void main(String[] args) {
		System.out.println("WELCOME");
		String a="TN61P2354";
		  try {
		     int b=Integer.parseInt(a);
		     System.out.println(b);
		       }
		 catch(ArithmeticException e) {
			   System.out.println("ARITHMATIC EXCEPTION");
			   System.out.println(e);
			
		}
		catch(NullPointerException e) {
			System.out.println("NULL POINTER EXCEPTION");
				
		}
		catch(NumberFormatException e) {
			System.out.println("NUMBER FORMAT EXCEPTION");
			
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("ARITHMATIC EXCEPTION");
			
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("WELCOME");

		

	}

}
