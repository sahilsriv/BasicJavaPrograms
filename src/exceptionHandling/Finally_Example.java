package exceptionHandling;

import java.util.Scanner;

public class Finally_Example {
	public static int divide_run_finally(int a,int b) {
		try{
			int res = (a/b);
			return res;
		}catch(Exception e){
			System.out.println(e);
		}finally {
			System.out.println("in divide_run_finally(int a,int b):finally after catch");
		}
		return -1;
	}
	public static void finally_in_loop() {
		int a=3;
		int b=3;
		while(true) {
			try{
				int res = (a/b);
				System.out.println(res);
			}catch(Exception e){
				System.out.println(e);
				break;
			}finally {
				System.out.println("in finally_in_loop(int a,int b):finally after catch");
			}
		b--;
		}
		System.out.println("After loop");
		}
    
    public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
    	int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		try {
			System.out.println(a/b);
		}catch(Exception e) {
			System.out.println(e);
		}
//		here u can think that it will work similar w/o Finally
		finally {
			System.out.println("in finally after catch");
		}
	
		int res = divide_run_finally(a,b);
		System.out.println(res);
		
		finally_in_loop();
		try {
			System.out.println(a/c);
		}
//		here u can think that it will work similar w/o Finally		
		finally {
			System.out.println("in finally w/o catch");
		}
		
		
	}
}
