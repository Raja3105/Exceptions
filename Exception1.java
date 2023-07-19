package exception;

public class Exception1 {

	public static void main(String[] args) {
      System.out.println();
      int a=10;
      int b=20;
      int c=0;
      System.out.println(a+b+c);
      try {
      System.out.println(a/c);
          }
      catch(Exception e) {
    	  System.out.println("Arithmatic exception");
      }
      
      System.out.println(a*b);
      System.out.println("Thank you");
      System.out.println();
	}

}
