import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileReaders {
	
	
	public static void main(String[] args) throws IOException {
		
		//copyCharacters();
		//ReaddataBuffered();
		ReaddatausingScanner();
		
		
	}
	
	
	public static void copyCharacters() throws IOException  {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("data.txt");
            outputStream = new FileWriter("data2.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }
	
	public static void ReaddataBuffered() throws IOException
	{
		BufferedWriter reader = null;
		BufferedReader read1 = null;
		char[] chdata ;
		try
		{
			read1 = new BufferedReader(new FileReader("C:\\Users\\Hp\\workspace\\JavaPrograms\\data.txt"));
			String data;
			reader = new BufferedWriter(new FileWriter("C:\\Users\\Hp\\workspace\\JavaPrograms\\data2.txt"));
			while((data=read1.readLine())!=null)
			{
			reader.write(data);
			}
		
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally {
			reader.close();
		}
	
	}
	
	
	public static void ReaddatausingScanner() throws FileNotFoundException
	{
		 Scanner s = null;
	        try {
	            s = new Scanner(new BufferedReader(new FileReader("data.txt")));

	            while (s.hasNext()) {
	                System.out.println(s.next());
	            }
	        } finally {
	            if (s != null) {
	                s.close();
	            }
	        }
	}

}
