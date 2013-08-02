
public class TestExceptionClass extends Exception{

	 private String message = null;
	 
	    public TestExceptionClass(String message) {
	        this.message=message;
	    }
	 
	    

	    
		public String getMessage() {
			return message;
		}

	
	
}

