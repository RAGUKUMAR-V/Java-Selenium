package javainterview;

public class Arrayduplicate {
	
	public static int[] array1(int[] arr1) {
		for(int i=0;i<arr1.length;i++) {
			for(int j=i+1;j<arr1.length;j++) {
				if(arr1[i]==arr1[j]) {
					System.out.println(arr1[j]);
				}
			}
		}
		return arr1;
	}
	
	public static void array2(int[] arr2) {
		for(int i=0;i<arr2.length;i++) {
			for(int j=i+1;j<arr2.length;j++) {
				if(arr2[i]==arr2[j]) {
					System.out.println(arr2[j]);
				}
			}
		}
		
	}
	
	

	public static void main(String[] args) {
	
		int[] givenarray1={1,1,2,3};
		Arrayduplicate.array1(givenarray1);
		
		int[] givenarray2={2,4,4};
		Arrayduplicate.array1(givenarray2);
		
		
		
	}

}
