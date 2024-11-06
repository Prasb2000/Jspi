package Vowel;
import java.util.*;
public class Missingvow {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String S = sc.next();
		System.out.println(missing(S));
		
	}
	
	public static String missing(String s) {
		String ch = "a e i o u A E I O U";
		
		String res = "";
		
		for (int i = 0; i < ch.length(); i++) {
			for (int j = 0; j < s.length(); j++) {
				if(ch.charAt(i)==s.charAt(j)) {
					ch=ch.replace(ch.charAt(i)+"", "");
				}
			}
		}
		
		
		
		
		return ch;
	}

}
