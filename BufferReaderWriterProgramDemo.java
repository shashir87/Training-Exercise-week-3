import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class BufferReaderWriterProgramDemo {

	/**
	 * @param args
	 */
	public static void main(String args[])
    {
        try{
            String filename = "F:\\workspace\\AE2\\AssEx2.java";
            FileReader fileReader = new FileReader(filename);
            BufferedReader reader=new BufferedReader(fileReader);

            FileWriter writer = new FileWriter("F:\\workspace\\AE2\\writingFile.txt");
            BufferedWriter out = new BufferedWriter(writer);
            Scanner in = new Scanner(fileReader);
            while(in.hasNextLine()){
                String readLine = in.nextLine().trim();
                out.write(readLine);
                out.write("\n");
            }

            out.close();
            reader.close();
        }catch (Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}