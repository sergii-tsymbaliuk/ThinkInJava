package tsymb;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

class Films{
	private static int next = 0;
	static String[] films = {"Star Wars","Unthinkable","Terminator 2","Inception"};
	static String nextFilm(){
		if (next == films.length)
			next = 0;
		return films[next++];
	}
}
public class FilmGEnerator {

	public static void main(String[] args) {
		HashSet<String> hs = new HashSet<String>();
		ArrayList<String> al = new ArrayList<String>();
		LinkedList<String> ll = new LinkedList<String>();
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		TreeSet<String> ts = new TreeSet<String>();
		
		for (int i = 0;i<7;i++){
			hs.add(Films.nextFilm());
			al.add(Films.nextFilm());
			ll.add(Films.nextFilm());
			lhs.add(Films.nextFilm());
			ts.add(Films.nextFilm());
		}
		
		System.out.println("HashSet");
		for (String s : hs)
			System.out.println(s);

		
		System.out.println("ArrayList");
		for (String s : al)
			System.out.println(s);
		
		System.out.println("LinkedList");
		for (String s : ll)
			System.out.println(s);

		System.out.println("LinkedHashSet");
		for (String s : lhs)
			System.out.println(s);
		
		System.out.println("TreeSet");
		for (String s : ts)
			System.out.println(s);

	}

}
