package secondMaxocc;

import java.util.Iterator;

public class Secondmaxvalocc {

	public static void main(String[] args) {
		int arr[] = {1,4,2,4,3,5,5,5,6,7,7};
		secondOcc(arr);
			
	}
	
	
	public static void secondOcc(int[] arr) {
		int max =Integer.MIN_VALUE;
		int second_max=Integer.MIN_VALUE;
		int count=0;
		for (int i : arr) {
			if(i>max) {
				second_max=max;
				max=i;
			}
		}
		for (int i : arr) {
			if(second_max==i) {
				count++;
			}
		}
		System.out.println(count);
	}

}
