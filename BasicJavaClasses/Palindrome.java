public class Palindrome {
	public static void main(String[] args) {
		String palindrome = "EduaDe";
		int len = palindrome.length();
		StringBuilder dest = new StringBuilder(len);
		for (int i = (len - 1); i >= 0; i--) {
			dest.append(palindrome.charAt(i));
		}
		boolean check = true;
		int counter = 0;
		while(check) {
			if(dest.toString().toLowerCase().charAt(counter) == palindrome.toLowerCase().charAt(counter)) {
				System.out.println(dest.toString().charAt(counter));
				System.out.println(palindrome.charAt(counter));
				counter++;
				if(counter == palindrome.length()) {
					System.out.println("Su rovnake");
					break;
				}
			} else {
				System.out.println("Niesu rovnake");
				break;
			}
		}
	}	
}
