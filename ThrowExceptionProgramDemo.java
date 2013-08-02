
public class ThrowExceptionProgramDemo {

	/**
	 * @param args
	 */
	 public static void main(String[] a){
	        try{
	        	
	        	String test = null;
	        	TestExceptionClass testException = new TestExceptionClass(test);
	            myTest(null);
	        } catch(TestExceptionClass tec){
	            System.out.println("Inside catch block: "+tec.getMessage());
	        }
	    }
	     
	    static void myTest(String str) throws TestExceptionClass{
	        if(str == null){
	            throw new TestExceptionClass("String val is null");
	        }
	    }
	}