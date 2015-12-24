package tsymb;

import java.util.Scanner;

interface TestAnonimousClass{
	public void doSmtng (String s, TestAnonimousClass parent);
}

public class TestStringPool {
	
	public static void main (String args[]){
		String s = "";
		new Scanner(System.in).nextLine();
		TestAnonimousClass tac;
		
		for (long i=0;i<1000000000;i++){
			tac = new TestAnonimousClass(){
				String s;
				TestAnonimousClass parent;
				
				public void doSmtng(String s,TestAnonimousClass parent) {
					this.s = s+" "+String.valueOf(s);
					this.s.intern();
				}
			};
			tac.doSmtng(s,tac);
			//System.out.println(s);
		}
	}
}
