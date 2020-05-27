package Createdoc;

import java.io.File;
import java.io.FileOutputStream;

import org.apache.poi.xwpf.usermodel.XWPFDocument;

public class CreateDoc {
	public static void main(String[] args)throws Exception  {
		   
	      //Blank Document
	      XWPFDocument document = new XWPFDocument(); 
			File file = new File("F:\\Java OOPS\\createdocument.docx");
	      //Write the Document in file system
	      FileOutputStream out = new FileOutputStream(file);
//	      document.write(out);
//	      out.close();
	      System.out.println("createdocument.docx written successully");
	      
	   // Get length of file in bytes
//	      long fileSizeInBytes = file.length();
//	      // Convert the bytes to Kilobytes (1 KB = 1024 Bytes)
//	      long fileSizeInKB = fileSizeInBytes / 1024;
//	      // Convert the KB to MegaBytes (1 MB = 1024 KBytes)
//	      long fileSizeInMB = fileSizeInKB / 1024;
//
//	      if (fileSizeInKB > 3) 
//	      {
//	    	  File newile = new File("F:\\Java OOPS\\createdocument_1.docx");
//	    	  FileOutputStream out1 = new FileOutputStream(newile);
//		      document.write(out1);
//		      out1.close();
//		      document.close();
//		      System.out.println("createdocument1.docx written successully");
//	        
//	      }
//	      else
//	      {
//	    	  System.out.println("Can't create the file , it is not greater than 3Kb");
//	      } 
//	      
    }

}
