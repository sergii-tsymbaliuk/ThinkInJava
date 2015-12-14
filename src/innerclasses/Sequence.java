//: innerclasses/Sequence.java
package innerclasses; /* Added by Eclipse.py */

import java.util.ArrayList;
import java.util.List;

// Holds a sequence of Objects.

interface Selector {
  boolean end();
  Object current();
  void next();
}	

public class Sequence {
  //Changed to Array List according to the task 11.2
  private List<Object> items;
  //private Object[] items;
  //private int next = 0;
  public Sequence() { 
	  items = new ArrayList<Object>();//new Object[size]; 
  }
  public void add(Object x) {
    //if( next < items.size()//length
    		//)
      items.add(x);
  }
  private class SequenceSelector implements Selector {
    private int i = 0;
    public boolean end() { return i == items.size(); }
    public Object current() { return items.get(i); }
    public void next() { if(i < items.size()) i++; }
  }
  
  public Selector selector() {
    return new SequenceSelector();
  }	
  
  public static void main(String[] args) {
    Sequence sequence = new Sequence();
    for(int i = 0; i < 10; i++)
      sequence.add(Integer.toString(i));
    Selector selector = sequence.selector();
    while(!selector.end()) {
      System.out.print(selector.current() + " ");
      selector.next();
    }
  }
} /* Output:
0 1 2 3 4 5 6 7 8 9
*///:~
