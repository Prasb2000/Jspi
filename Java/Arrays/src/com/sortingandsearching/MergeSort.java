package com.sortingandsearching;

/* Sample input:  [1, 5, 7, 2, 3, 6]--> Before sorting
   Sample output: [1, 2, 3, 5, 6, 7]--> After sorting */
import java.util.*;

public class MergeSort {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.println("Enter your element num "+i+": ");
			a[i]=sc.nextInt();
		}
		System.out.println("The array you entered is : "+ Arrays.toString(a));
		sort(a);
		System.out.println("The sorted array is: "+Arrays.toString(a));
	}
	
	static void sort(int[] a) {
		if(a.length==1) return;
		
		int[] left = new int[a.length/2];
		int[] right = new int[a.length-left.length];
		
		int i =0;
		while (i<left.length) {
			left[i]=a[i];
			i++;
		}
		int j =0;
		while (j<right.length) {
			right[j]=a[i];
			j++;
			i++;
		}
		sort(left);
		sort(right);
		merge(left, right, a);
		
	}
	
	
	static void merge(int[] a, int[] b, int[] c) {
		int i=0, j=0, k=0;
		while (i<a.length && j<b.length) {
			if (a[i]<b[j]) {
				c[k++]=a[i++];
			}
			else
				c[k++]=b[j++];
		}
		while (i<a.length) {
			c[k++]=a[i++];
		}
		while (j<b.length) {
			c[k++]=b[j++];
		}
	}

}

