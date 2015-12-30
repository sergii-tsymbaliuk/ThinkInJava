package tsymb.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class FileTextReader {
	final static String FILENAME = "d:\\ws\\ThinkInJava\\src\\tsymb\\io\\FileProcessor.java";
	final static String OUTPUTFILE = "output.txt";

	public static void main(String[] args) throws IOException {
		BufferedReader br = null;
		LinkedList<String> lines = new LinkedList<String>();
		String s, filename;
//		StringBuilder pattern =  new StringBuilder();
		List<String> words = null;
		PrintWriter output = new PrintWriter( 
									new BufferedWriter(	
											new FileWriter( OUTPUTFILE )
											));
		
		if ( args.length == 0 )
			filename = FILENAME;				
		else {
			filename = args[0];	
		
			if ( args.length > 1) {
				words = Arrays.asList(args).subList(1, args.length);
			}
		}

		try {
			br = new BufferedReader (
					new FileReader ( filename ));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		try {
			while ( (s = br.readLine()) != null ) {
				lines.add(s);
			}
		} catch ( IOException e ) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		Collections.reverse(lines);
		
		if ( words == null ) 
			for ( String ss : lines ) {
				System.out.println( ss.toUpperCase() );
			}
		else {
			for ( String ss : lines ) {
				int lineCount = 0;
				for ( String w : words ){
					if (ss.toUpperCase().contains(w.toUpperCase()) ) {
						output.println(lineCount++ + " " + ss.toUpperCase());
						break;
					}
				}
			}
			output.close();
		}
	}

}
