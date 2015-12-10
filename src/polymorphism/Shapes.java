//: polymorphism/Shapes.java
package polymorphism; /* Added by Eclipse.py */
// Polymorphism in Java.
import polymorphism.shape.*;

public class Shapes {
  private static RandomShapeGenerator gen =
    new RandomShapeGenerator();
  public static void main(String[] args) {
    Shape[] s = new Shape[9];
    // Fill up the array with shapes:
    for(int i = 0; i < s.length; i++)
      s[i] = gen.next();
    // Make polymorphic method calls:
    for(Shape shp : s)
      shp.draw();
    
    System.out.println("---------------------------------");
    
    int i = 0;
    RandomShapeGenerator rsg = new RandomShapeGenerator(23) ;
    for(Shape shp : rsg){
    	System.out.println(i++);
    	if (shp != null) 
    		shp.draw();
    }
  }
} /* Output:
Triangle.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Square.draw()
Triangle.draw()
Circle.draw()
*///:~
