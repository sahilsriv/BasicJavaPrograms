package exceptionHandling;

import java.util.Scanner;

public class SpecificExceptionHandling {

	public static void main(String[] args) {
		int arr[] = new int[3];
		arr[0]=5;
		arr[1]=6;
		arr[2]=9;
		Scanner sc = new Scanner(System.in); 
		//boolean flag = true;
		//while(flag) {
		System.out.println("enter an index:");
		int ind = sc.nextInt();
		System.out.println("enter 2nd no.:");
		int sec_no=sc.nextInt();
		try {
			System.out.println("number at given index: "+arr[ind]);
			System.out.println("number[ind]/sec_no = "+arr[ind]/sec_no);
			//flag=false;
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		//}
		}
		sc.close();
	}

}
