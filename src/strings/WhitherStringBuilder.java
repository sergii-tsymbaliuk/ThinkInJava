//: strings/WhitherStringBuilder.java
package strings; /* Added by Eclipse.py */

public class WhitherStringBuilder {
  public String implicit(String[] fields) {
    String result = "";
    for(int i = 0; i < fields.length; i++)
      result += fields[i];
    return result;
  }
  public String explicit(String[] fields) {
    StringBuilder result = new StringBuilder();
    for(int i = 0; i < fields.length; i++)
      result.append(fields[i]);
    return result.toString();
  }
  
  public String iterate(int num){
	  String s = "String: ";
	  for (int i=0; i< num; i++ )
		  s=s+" " + i;
	  return s;
  }
} ///:~
