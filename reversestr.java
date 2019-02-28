
public class reversestr {
public static void main(String[] args) {
	System.out.println(reverserecursion("Dwight"));
}
public static String reverserecursion(String s) {

	 if(s.length()==1) return s;
	 System.out.println("The s is now: "+s);
	  s = reverserecursion(s.substring(1)) +s.charAt(0);
	  System.out.println("after recursion");
	  System.out.println();
	 System.out.println("The s is now: "+s);

	return s;
}
}
