package secondMaxocc;

public class SecondSmallest {

	public static void main(String[] args) {
		int [] a = {1,4,6,8,1,2,1};
		int smallest = a[0];
		int sec_smallest = a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]==smallest) {
				continue;
			}
			if (a[i]<smallest) {
				sec_smallest=smallest;
				smallest = a[i];
			}
			else if (a[i]<sec_smallest || smallest == sec_smallest) {
				sec_smallest=a[i];
			}
		}
		System.out.println(sec_smallest);
	}

}
