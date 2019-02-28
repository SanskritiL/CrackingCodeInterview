
public class ReverseString {
public static void main(String[] args) {
	char[]  answer = reverse("Bohemian");
	
	for(char c: answer) {
		System.out.print(c);
	}
}
public static void swap(char a , char b) {
	char temp =  a;
	a = b;
	b=temp;
	System.out.println(a);
	System.out.println(b);
}
public static char[] reverse(String s) {
	int start = 0;
	int end = s.length()-1;
	char[] inputarr = s.toCharArray();
	
	while(end>start) {
		
		char temp = inputarr[start];
		inputarr[start] = inputarr[end];
		inputarr[end] = temp; 
		
		
		start++;
		end--;
		
	}
	return inputarr;
}
}
