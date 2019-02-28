import java.util.Arrays;

public class Firstnonrepeating {
public static void main(String[] args) {
	char[] ok = printDuplicates("organic compund");
	System.out.println(Arrays.toString(ok));
	
}
public static char[] printDuplicates(String mystr) {
	 boolean arr[] = new boolean[256];
	 char repeated[] = new char[10];
	 int count=0;
	 String lowermystr = mystr.toLowerCase();
	 if(lowermystr==null) {System.out.println("null val");}
	 if(lowermystr.length()==1) {System.out.println("No repeating char. Just one elem");}
	 for(int i =0;i<lowermystr.length();i++){
		 int ascii = lowermystr.charAt(i);
		 if(!arr[ascii]) {
			 arr[ascii] = true;
		 }
		 else {
			repeated[count] = lowermystr.charAt(count);
			count++;
		 }
	 }
	 return repeated;
}



}
