package exceptions;

public class ExceptionDemo {
	
	public static int fact(int n) throws NegativeNumberException {
		if(n<0) {
			throw new NegativeNumberException();
		}
		int ans = 1;
		for(int i = 2; i <= n; i++) {
			ans = ans * i;
			
		}
		return ans;
		
	}
	//to show unchecked exception that we have created we
	//have to pass that exception in the function where we want as throws exceptions
	public static int divide(int a, int b) throws  DivideByZeroException{
	//after passing throws exception here main will show error which is not going to recognize it so we
		//have to pass it main also
		int result;
		if(b == 0) {
	    	throw new  DivideByZeroException();
//	    	throw new ArithmeticException();
	    }
		result = a/b;
		return result;
	}

	public static void main(String[] args)  {
		//if main doesn't want to throw exception and want to deal with that than try will help them
		
//		String s = null;
//		System.out.println(s.length());
//        System.out.println(4/0);
//        System.out.println("Main");
		
		//within try if no exception comes than catch will not going to work 
		//but everything within try is going to work fine
		
		try {
			//try same for all function but catch will be different for all 
			
//			System.out.println("after it exception comes in function");
			
			System.out.println(divide(15, 5));//divide will cause exception and catch will deal with that exception
			//within try after getting exception no any statement is going to be executed
			System.out.println(fact(4));
			
			System.out.println("this is not going to print");
			
		} catch (DivideByZeroException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Divide by zero exception raised");
		} catch (NegativeNumberException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("Negative number Exception");
		}finally {
			//finally will geeting executes whether try or catch will work or not
			System.out.println("main");
		}
		System.out.println("Main");
	}

}
