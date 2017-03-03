
public class Task05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1223221;
		int x = 0;
		
		if (palindrome(n, x) == n) {
			System.out.println("palindrome");
		} else {
			System.out.println("not palindrome");
		}
	}
	
	static int palindrome(int n, int x) {
		if (n == 0) {
			return x;
		}
		
		int dig = n%10;
		x = x*10 + dig;
		
		return palindrome(n/10, x);
	}

}
