//Task 11.1
package tsymb;

import java.util.ArrayList;
import java.util.Random;

class Gerbil {
	int gerbilNumber;
	public Gerbil(int gerbilNumber) {
		this.gerbilNumber = gerbilNumber;
	}
	void hop(){
		System.out.println(gerbilNumber+" short message");
	}
}

public class GerbilMain{
	public static void main(String args[]){
		ArrayList<Gerbil> gerbs = new ArrayList<Gerbil>();
		
		Random r = new Random(47);
		
		for (int i = 0; i < 15; i++){
			gerbs.add(new Gerbil(r.nextInt()));
		}
		
		for (Gerbil g : gerbs)
			g.hop();
	}
}
