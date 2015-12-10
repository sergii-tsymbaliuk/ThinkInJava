//: holding/NonCollectionSequence.java
package holding; /* Added by Eclipse.py */
import typeinfo.pets.*;
import java.util.*;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

class PetSequence {
  protected Pet[] pets = Pets.createArray(8);
}

public class NonCollectionSequence extends PetSequence {
  public Iterator<Pet> iterator() {
    return new Iterator<Pet>() {
      private int index = 0;
      public boolean hasNext() {
        return index < pets.length;
      }
      public Pet next() { return pets[index++]; }
      public void remove() { // Not implemented
        throw new UnsupportedOperationException();
      }
    };
  }
  
  //ST added 10.12.15 - Task 11.32 reversed and random iterators
  public Iterable <Pet> reversed() {
	  return new Iterable<Pet>() {
		  public Iterator<Pet> iterator() {

			  return new Iterator<Pet> () {
				  
			      private int index = pets.length;
			      public boolean hasNext() {
			        return index > 0;
			      }
			      public Pet next() { return pets[--index]; }
			      public void remove() { // Not implemented
			        throw new UnsupportedOperationException();
			      }
			  };
		  }
	  };
  }
		
  public Iterator<Pet> randomized() {
		  List<Pet> list = new ArrayList<Pet>(Arrays.asList(pets));
		  Collections.shuffle(list,new Random(47));
		  return list.iterator();
  }  
  
  public static void main(String[] args) {
    NonCollectionSequence nc = new NonCollectionSequence();
    InterfaceVsIterator.display(nc.iterator());
    InterfaceVsIterator.display(nc.reversed().iterator());
    InterfaceVsIterator.display(nc.randomized());
    for(Pet p : nc.reversed()){
    	System.out.println(p);
    }
  }
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
