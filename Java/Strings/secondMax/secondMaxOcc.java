package secondMax;
import java.util.*;
public class secondMaxOcc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String S = sc.next();
		secndMaxstr(S);
		

	}
	
	public static void secndMaxstr(String s) {
		int max = 0;
		int second_max = 0;
		int freq = 0;
		char ch = s.charAt(0);
		while(s.length()>0) {
			String s1="";
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(0)==s.charAt(i)) {
					freq++;
				}
				else {
					s1+= s.charAt(i);
				}
			}
			if(freq>max) {
				max=freq;
			}
			
			else if(freq>second_max) {
				second_max=freq;
				ch = s.charAt(0);
			}
			s=s1;
			freq=0;
		}
		System.out.println(ch + " = "+second_max);
	}

}
