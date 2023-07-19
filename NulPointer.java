package exception;

public class NulPointer {

	public static void main(String[] args) {
		String name=null;
		System.out.println(name);
		try {
		System.out.println(name.toUpperCase());
		}
		catch(ArithmeticException e) {
			System.out.println("ARITHMATIC EXCEPTION");
			System.out.println(e);
			
		}
		catch(NullPointerException e) {
			System.out.println("NULL POINTER EXCEPTION");
			//System.out.println(e);
			//e.printStackTrace();
			
		}
		catch(NumberFormatException e) {
			System.out.println("NUMBRRFORMATEXCEPTION EXCEPTION");
			
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
