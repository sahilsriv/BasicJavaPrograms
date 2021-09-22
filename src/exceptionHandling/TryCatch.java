package exceptionHandling;

public class TryCatch {

	public static void main(String[] args) {
       int a = 2000;
       int b =0;
	
	int result;
	try {
	result = a/b;
	System.out.println(result);
	}
	catch(Exception e) {
		System.out.print("failed to divide. Reason: ");
		System.out.println(e.getMessage());
	}
	System.out.println("End of program.");
	}
}
