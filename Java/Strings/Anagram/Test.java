package Anagram;
import java.util.*;
public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string of your choice: ");
		String S1 = sc.next();
		System.out.println("Enter another string of your choice: ");
		String S2 = sc.next();
		if (isAnagram(S1, S2)) {
			System.out.println("The strings are Anagram");
		}
		else 
			System.out.println("Not Anagram!");

	}
	
	public static boolean isAnagram(String s1, String s2) {
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		while (true) {
			if(s1.length()!=s2.length()) return false;
			if(s1.length()==0 && s2.length()==0) return true;
			char ch = s1.charAt(0);
			s1 = s1.replace(ch+"", "");
			s2 = s2.replace(ch+"", "");
		}
	}

}
