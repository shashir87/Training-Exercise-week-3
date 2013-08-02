import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileStreamReaderWriterProgramDemo {

	/**
	 * @param args
	 * @throws FileNotFoundException 
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		String filename = "F:\\workspace\\AE2\\AssEx2.java";
		FileInputStream fileInputStream = new FileInputStream(filename);
		FileOutputStream fileOutputStream = new FileOutputStream("F:\\workspace\\AE2\\Stream.txt");
		try {
			int i;
			while((i=fileInputStream.read())!=-1){
				System.out.println((char)i);
				fileOutputStream.write(i);
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
