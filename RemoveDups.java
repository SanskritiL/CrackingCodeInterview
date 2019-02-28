
public class RemoveDups {
 public static void main(String[] args) {
	printDuplicates("Aeroplane");
}
 public static void printDuplicates(String mystr) {
	 boolean arr[] = new boolean[256];
	 
	 String lowermystr = mystr.toLowerCase();
	 if(lowermystr==null) {System.out.println("null val");}
	 if(lowermystr.length()==1) {System.out.println("No repeating char. Just one elem");}
	 for(int i =0;i<lowermystr.length();i++){
		 int ascii = lowermystr.charAt(i);
		 if(!arr[ascii]) {
			 arr[ascii] = true;
		 }
		 else {
			 System.out.println(lowermystr.charAt(i));
		 }
	 }
 }
}
