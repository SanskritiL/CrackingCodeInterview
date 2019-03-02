/*
public class Permutation {
 
public static void main(String[] args) {
	findpermutation("ABC");
}
public static void findpermutation(String s) {
	
	
	
}

}
*/

public class Permutation { public static void main(String args[]) { permutation("DOSA"); }
/* * A method exposed to client to calculate permutation of String in Java. */ 
public static void permutation(String input){ permutation("", input); } 
/* * Recursive method which actually prints all permutations * of given String, but since we are passing an empty String * as current permutation to start with, * I have made this method private and didn't exposed it to client. */



private static void permutation(String perm, String word) 
{ 
	if (word.isEmpty()) { 
		System.err.println(perm + word); 
		System.out.println("emoty re");
		System.out.println("1");
		} 
else { 
	for (int i = 0; i<word.length(); i++) 
{         System.out.print(" PERM is "+perm);
System.out.print(" and word is"+word);
System.out.println();
System.out.println("i is :"+i);

System.out.print(perm+word.charAt(i)+" and added to  ");
System.out.print(word.substring(i+1, word.length()));

System.out.println();
		permutation(perm + word.charAt(i), word.substring(0, i) + word.substring(i + 1, word.length()));
		}
	}
} 
}

