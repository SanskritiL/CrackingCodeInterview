
public class Palindrome {
public static void main(String[] args) {
	System.out.println(palindrome(1234));
}
public static int palindrome(int x) {
	int reverse = 0;
	int num=0;
	 while(x!=0) {
		 
		
		 
		 reverse = reverse*10 + x%10;
		 x = x/10;
	 }
	return reverse;
}

}
