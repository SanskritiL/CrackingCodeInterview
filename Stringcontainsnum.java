
public class Stringcontainsnum {
public static void main(String[] args) {
	System.out.println(containsallnum("8899095"));
}
public static boolean containsallnum(String s) {
	int a ='0';
	int b = '9';
	
	for(int i =0;i<s.length();i++) {
		int x = s.charAt(i);
		if(!(x>= a && x<=b)) {
			return false;
		}
	}
	return true;
}
}
