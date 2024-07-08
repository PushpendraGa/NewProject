package PageClass;

public class maxmimumNumber {

	public static void main(String[] args) {

		int [] a = {3,4,5,6,7,8,9,2};
		
		int minium = a[4]; // 7
		
		for (int i = 0; i < a.length; i++) {
			
			
			if (a[i]>minium) {
				
				minium = a[i];
			}
		}
			
		
		System.out.println(minium);
		
		
	}

}
