public class Palindrome {
	public static void main(String[] args) {
		StringBuilder dest = new StringBuilder("Matej a Jetam");
		if(dest.toString().equalsIgnoreCase(dest.reverse().toString())) {
			System.out.println("Su rovnake");
		} else {
			System.out.println("Niesu rovnake");
		}
	}	
}
