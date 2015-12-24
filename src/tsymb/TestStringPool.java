package tsymb;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

interface TestAnonimousClass{
	public TestAnonimousClass init (String s);
}

public class TestStringPool {
	
	public static void main (String args[]){
		String s = new String("asdfasd");
		new Scanner(System.in).nextLine();
		//TestAnonimousClass tac;
		Random rnd  = new Random(47);
		List<TestAnonimousClass> list = new ArrayList<TestAnonimousClass>();
		
		while(true){
			s = "New Int: "  + rnd.nextLong();
			list.add( new TestAnonimousClass(){
				String s;
				public TestAnonimousClass init(String s) {
					this.s = s;
					return this;
				};}.init(s));
		}
//			tac = new TestAnonimousClass(){
//				String s;
//				TestAnonimousClass parent;
//				
//				public void doSmtng(String s,TestAnonimousClass parent) {
//					this.s = s+"kjhlkjh"+String.valueOf(s);
//					this.s.intern();
//				}
//			};
			//tac.doSmtng(s,tac);
			//System.out.println(s);
		//}
	}
}
