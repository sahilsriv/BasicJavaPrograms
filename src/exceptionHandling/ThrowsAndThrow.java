package exceptionHandling;


class NegativeRadiusException extends Exception{
    @Override
    public String toString() {
        return "Radius cannot be negative!";
    }

    @Override
    public String getMessage() {
        return "Radius cannot be negative!";
    }
}

public class ThrowsAndThrow {

    public static double area(int r) throws NegativeRadiusException{
        if (r<0){
            throw new NegativeRadiusException();
        }
        double result = Math.PI * r * r;
        return result;
    }

    public static int divide(int a, int b) throws ArithmeticException{
        // Made By Harry
        int result = a/b;
        return result;
    }
    public static void main(String[] args) {
        // Shivam - uses divide function created by Harry
    	
        try{
//            int c = divide(6, 0);
//            System.out.println(c);
        	double ar = area(-1);
            System.out.println(ar);
        }
        catch(Exception e){
            System.out.println("Exception");
        }
    }
}

//class ExampleThrows{
//	public static int divide(int a,int b) throws ArithmeticException{
//		int result;
//		result = a/b;
//		return result;
//	}
////	public static () {
////		
////	}
//	
//}

//public class ThrowsAndThrow {
//	public static int divide(int a,int b) throws ArithmeticException{
//		int result;
//		result = a/b;
//		return result;
//	}
//
//	public static void main(String[] args) {
//	int c = divide(2,1);
//     System.out.println(c);
//	}
//
//}
