import java.io.*;


public class FileCopyProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{	

		// Creating Filestreams to read and write to a file
		InputStream reader = null;
		OutputStream writer = null;

		try{

			//Defining source and destintion location
			File sourceFile =new File("weather.txt");
			// Defining the default workspace path for destination but it can be changed to anylocation to copy the file
			File destinationFile =new File("newWeatherFile.txt");
			
			// Reading and writing the file.
			reader = new FileInputStream(sourceFile);
			writer = new FileOutputStream(destinationFile);
			byte[] buffer = new byte[1024];
			int length;
			//copy the file content in bytes 
			while ((length = reader.read(buffer)) > 0)
			{
				writer.write(buffer, 0, length);
			}
			reader.close();
			writer.close();
			System.out.println("File is copied successful!");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}