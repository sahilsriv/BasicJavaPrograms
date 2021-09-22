package exceptionHandling;

import java.util.Scanner;

class MyException extends Exception{
	@Override 
	public String toString() {
	        return "I am toString()";
	    }
	@Override
	public String getMessage() {
		return "I am getMessage";
		
	}
}

public class ThrowCustomException {

	public static void main(String[] args) {
		int month;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Month: ");
		month = sc.nextInt();
		if(month>12) {
			try {
				throw new MyException();
			}
			catch (Exception e) {
				System.out.println(e.toString());
				System.out.println(e.getMessage());
				System.out.println(e);
				System.out.println("finished");
			}
			System.out.println("yes Finished");
		}
			
		sc.close();
		
		System.out.println("yes last Finished");
	}

}
