package tsymb.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class FileExecute {
	public String command = "dir";
	
	public FileExecute(String command) {
		super();
		this.command = command;
	}

	public void run(final PrintStream os) throws IOException{
		String s = null;
		Process process = new ProcessBuilder(command.split(" ")).start();
		
		BufferedReader br = new BufferedReader(new InputStreamReader( process.getInputStream()));

		while ( (s = br.readLine()) != null ) {
			os.println(s);
		}
	}
	
	public static void main(String[] args) throws IOException {
		new FileExecute("CMD /C dir c:\\windows\\").run(System.out);
	}

}
