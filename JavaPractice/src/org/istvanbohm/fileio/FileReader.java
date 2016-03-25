package org.istvanbohm.fileio;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileReader {

	public static void main(String[] args) throws IOException {

    	 FileInputStream is = new FileInputStream(".\\data\\input.txt");
    	 InputStreamReader isr = new InputStreamReader(is);

         int c;
         char[] buffer = new char[5];
         while ((isr.read(buffer,2,3)) != -1) {
            System.out.println(buffer);
         }


	}

}
