package tsymb.io;

import java.io.File;
import java.io.FileFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;

public class FileProcessor {
	final static Logger log = Logger.getLogger(FileProcessor.class.getName());
	
	public interface Action {
		public void action(File file);
	}

//	protected final File path;
//	protected final Action action;
//	protected final Pattern pattern;
//	protected boolean recursive;
//	protected List<File> files;
	
//	FileProcessor(File path, Pattern pattern, Action action, boolean recursive) {
//		this.path = path;
//		this.action = action;
//		this.pattern = pattern;
//		this.recursive = recursive;
//	}
	
	static public void applyAction(String path, String pattern, Action action, boolean recursive) {
		applyAction( new File( path ), Pattern.compile( pattern ), 
					action, recursive );
	}
	
	static public void applyAction(File path, final Pattern pattern, Action action, final boolean recursive) {
		if ( path.isFile() ) {
			log.log( Level.INFO, "File: " + path.getPath() );
			action.action( path );
		}
		else 
			if ( path.isDirectory() ) {
				log.log( Level.INFO, "Directory: " + path.getPath() );
				File files[] = path.listFiles( 
					new FileFilter() {
						public boolean accept( File pathname ) {
							log.log(Level.INFO, "FileFilter " + pathname.getPath() + " check " + pattern.toString());
							return pathname.isFile() && pattern.matcher( pathname.getPath() ).matches() 
								|| pathname.isDirectory() && recursive;
						}
					}
				);
				for( File file : files)
					applyAction( file, pattern, action, recursive );
			}

	}
	
	public static void main( String args[] ) {
		if ( args.length != 1 ) {
			System.out.println( "Usage: FileProcessor <pattern>" );
			return;
		}
		System.out.println( "Do action \"Print\" for files: "+args[0] );
		FileProcessor.applyAction(
				args[0], ".*\\.java", 
				new FileProcessor.Action() {
					public void action( File file ) {
						System.out.println( file.getAbsolutePath() );						
					}}, 
				true );
	}
	
}
