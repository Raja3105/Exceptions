package exception;

public class ArayIndexOutBoundExcep {

	public static void main(String[] args) {
		System.out.println("WELCOME");
		int [] a= {1,2,3,5,6,7,8};
		  try {
		     
		     System.out.println(a[10]);
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
		catch(ArrayIndexOutOfBoundsException e) {
			   System.out.println("ARRAY OUT OF BOUND EXCEPTION");
			   System.out.println(e);
			
		}
		catch(Exception e) {
			   System.out.println("Exception");
		        }
		      
	    finally {
			 
	    	       System.out.println("DONE");
		    	   
		       }

	}

}
