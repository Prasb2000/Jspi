package Reverse;

import java.util.Scanner;

public class Reverse {
 
	public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a string: ");
		 String s = sc.nextLine();
		 System.out.println("The reversed string is: ");
		 System.out.print(rev(s));
	 }
		
		 
	 
	 public static String rev(String s) {
		String s1="";
		int i = s.length()-1;
		int j =s.length()-1;
		while (j>=0) {
			
			while(j>=0 && s.charAt(j)!=' ') {
				j--;
				String temp = "";
				int k=j+1;
				while(k<=i) {
					temp += s.charAt(k);
					k++;
				}
				
				s1+=temp;
			}
			
			j--;
			i=j;
		}
		 
		 return s1;
	}

}
