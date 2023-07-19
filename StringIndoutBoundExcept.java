package exception;

public class StringIndoutBoundExcept {

	public static void main(String[] args) {
		System.out.println("WELCOME");
		String a="Hello";
		  try {
		     char b=a.charAt(11);
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
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("STRING INDEX OUT OF BOUND ARITHMATIC EXCEPTION");
			
		}
		catch(Exception e) {
			System.out.println("Exception");
		}
		System.out.println("WELCOME");

	}

}
