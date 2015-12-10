//: holding/CollectionSequence.java
package holding; /* Added by Eclipse.py */
import typeinfo.pets.*;
import java.util.*;

// ST 10.12.15 - Task 11.30
public class CollectionSequence
implements Collection<Pet> {
  private Pet[] pets = Pets.createArray(8);
  public int size() { return pets.length; }
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
  public static void main(String[] args) {
    CollectionSequence c = new CollectionSequence();
    InterfaceVsIterator.display(c);
    InterfaceVsIterator.display(c.iterator());
  }
	public boolean isEmpty() { return pets.length==0;	}
	public boolean contains(Object o) {
		for (Pet p : this){
			if ( o.equals(p) )
				return true;
		}
		return false;
	}
	public Object[] toArray() {
		return pets;
	}
	public <T> T[] toArray(T[] a) {
		throw new UnsupportedOperationException();
	}
	public boolean add(Pet e) {
		throw new UnsupportedOperationException();
	}
	public boolean remove(Object o) {
		throw new UnsupportedOperationException();
	}
	public boolean containsAll(Collection<?> c) {
		for(Object p : c){
			if (!contains(p))
				return false;
		}
		return true;
	}
	public boolean addAll(Collection<? extends Pet> c) {
		throw new UnsupportedOperationException();
	}
	public boolean removeAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	public boolean retainAll(Collection<?> c) {
		throw new UnsupportedOperationException();
	}
	public void clear() {
		throw new UnsupportedOperationException();	
	}
} /* Output:
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
0:Rat 1:Manx 2:Cymric 3:Mutt 4:Pug 5:Cymric 6:Pug 7:Manx
*///:~
