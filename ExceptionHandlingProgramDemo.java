
public class ExceptionHandlingProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String a[]){
		try{
			for(int i=5;i>=0;i--){
				System.out.println(10/i);
			}
		} catch(Exception ex){
			System.out.println("Any number cannot be divided by 0");
			ex.printStackTrace();

		}
	}
}