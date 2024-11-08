package LongestCommonPrefix;

import java.util.*;
//"static void main" must be defined in a public class.
public class LongestCommPrefix {
 public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the length of the String array: ");
	 int n = sc.nextInt();
     String[] strs = new String[n];
     System.out.println("Start entering the String elements of the array: ");
     for (int i = 0; i < strs.length; i++) {
		strs[i]=sc.next();
		if (i<strs.length-1) {
			System.out.println("Enter next String ");
		}
		
	}
     System.out.println("The longest common prefix is : \n"+longestCommonPrefix(strs));
 }
 
 public static String longestCommonPrefix(String[] strs) {
     if(strs.length==0)
         return "";
     
     String Comm=strs[0];

     for(int i=1; i<strs.length; i++){
         String current = strs[i];

         int j = 0;
         while(j<Comm.length() && j<current.length() && Comm.charAt(j)==current.charAt(j) )
         {
             j++;
         }

         Comm = Comm.substring(0,j);

         if(Comm.length()<1){
             return"";
         }
     }
     return Comm;
 }
}
