//: generics/GenericMethods.java
package generics; /* Added by Eclipse.py */

import java.util.HashMap;

public class GenericMethods {
  public <T,E,F> void f(T x,E y,F z) {
    System.out.println(x.getClass().getName()+ " "+y.getClass().getName()+ " "+z.getClass().getName());
  }
  public static void main(String[] args) {
    GenericMethods gm = new GenericMethods();
    gm.f("",2.0d,"kljhlkh");
    gm.f(1,"asdf",true);
    gm.f(1.0,2L,234);
    gm.f(1.0F,234,0x2F4);
    gm.f('c',0b1101,"lkj");
    gm.f(gm,gm.getClass(),gm.getClass().getName());
  }
} /* Output:
java.lang.String
java.lang.Integer
java.lang.Double
java.lang.Float
java.lang.Character
GenericMethods
*///:~
