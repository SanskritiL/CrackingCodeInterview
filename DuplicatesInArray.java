import java.util.HashSet;

public class DuplicatesInArray {
 public static void main(String[] args) {
	int myarr[] =  {1,2,3,4,5,5,6};
	
     System.out.println(finddup(myarr));
	
	
}
 public static int finddup(int[] arr) {
	 HashSet<Integer> hs = new HashSet<Integer>();
	 for(int i=0;i<arr.length;i++) {
		 if(hs.contains(arr[i])) return i;
		 
		 else hs.add(arr[i]);
	 }
	 return 0;
 }
 
}
