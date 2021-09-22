package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class ChainedException {
	public static int divide(int a, int b) {
		int result;
		result = a/b;
		return result;
	}
     public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		try {
			if(b==0) {
				ArithmeticException ex = new ArithmeticException("Exception");
				ex.initCause(new IOException("this is an Actual Exception"));
				throw ex;
			}
			else System.out.println(divide(a, b));
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println(e.getCause());
		}
	}
}
