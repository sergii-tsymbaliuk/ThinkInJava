//: polymorphism/shape/RandomShapeGenerator.java
// A "factory" that randomly creates shapes.
package polymorphism.shape;
import java.util.*;

public class RandomShapeGenerator implements Iterable<Shape>{
  private Random rand = new Random(47);
  private int stopCount = 0;
  public Shape next() {
    switch(rand.nextInt(3)) {
      default:
      case 0: return new Circle();
      case 1: return new Square();
      case 2: return new Triangle();
    }
  }
  
  // ST 10.12.15 - task 11.31
  public RandomShapeGenerator(){}
  
  public RandomShapeGenerator(int stopCount){
	  this.stopCount = stopCount;
  }
  
  public Iterator<Shape> iterator() {
	  return new Iterator<Shape>(){
		int index = 0;
		
		public boolean hasNext() {
			return index < stopCount;
		}

		public Shape next() {
			if (hasNext()){
				index++;
				return RandomShapeGenerator.this.next();
			}
			else
				return null;
		}
	  };
  }
} ///:~
