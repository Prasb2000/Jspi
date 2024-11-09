package com.leetCode;
import java.util.*;

public class RomToInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a roman number : ");
	/*	V             5
		X             10
		L             50
		C             100
		D             500
		M             1000  */
		String S = sc.next();
		System.out.println("The corresponding numeric value is: ");
		System.out.println(romanToInt(S));
		
	}
	
	    public static int romanToInt(String s) {
	     
	        Map<Character, Integer> Romanmap = new HashMap<>();
	        Romanmap.put('I', 1);
	        Romanmap.put('V', 5);
	        Romanmap.put('X', 10);
	        Romanmap.put('L', 50);
	        Romanmap.put('C', 100);
	        Romanmap.put('D', 500);
	        Romanmap.put('M', 1000);

	        int res = 0; // Stores the result of the operations
	        for(int i =0; i<s.length(); i++){
	            int n = Romanmap.get(s.charAt(i));

	            if(i<s.length()-1 && n<Romanmap.get(s.charAt(i+1)))
	                res-=n;
	            
	            else{
	                res+=n;
	            }
	        }
	        return res;
	    }

}
