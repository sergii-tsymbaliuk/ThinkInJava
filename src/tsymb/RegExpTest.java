package tsymb;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {
	public static void main(String[] args) {
		Matcher matcher = Pattern.compile("\\w+").matcher("This is a test string");
		
		Pattern p = Pattern.compile("(?<phone>\\d{3}.?\\d{2}.?\\d{2})");
		String address = "Address: Kiev, Avtoz 123, flat 1. tel.428-71-80";
		
		Matcher phone = p.matcher(address);
		while (phone.find())
			System.out.println(phone.group("phone"));
		
		//while(matcher.find())
			//System.out.println(matcher.group());
		
		Matcher vovels = Pattern.compile("[oiuea]").matcher(address);
		
		StringBuffer sb = new StringBuffer();
		
		while(vovels.find())
			vovels.appendReplacement(sb, vovels.group().toUpperCase());
		vovels.appendTail(sb);

		System.out.println(sb);
	
	}

}
