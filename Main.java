public class Main {

	public static void main(String[] args) {
		Boolean isPalindrome = false;
		isPalindrome = PalindromeTest("Palindrome",isPalindrome);
		isPalindrome = PalindromeTest("Civic",isPalindrome);
		isPalindrome = PalindromeTest("Radar",isPalindrome);
		isPalindrome = PalindromeTest("Level",isPalindrome);
		isPalindrome = PalindromeTest("Eva, can I stab bats in a cave?",isPalindrome);
		isPalindrome = PalindromeTest("A man, a plan, a canal, Panama",isPalindrome);
		isPalindrome = PalindromeTest("Never odd or even",isPalindrome);
		isPalindrome = PalindromeTest("Doc, note: I dissent. A fast never prevents a fatness. I diet on cod.",isPalindrome);
	}
	public static boolean PalindromeTest(String aRaw, boolean isPalindrome){
		String A = aRaw.replaceAll("[\\W]", "");
		String B = "";
		int lengthA = A.length();
		for (int i = lengthA-1; i >= 0; i--) {
			B = B + A.charAt(i);
		}
		if (A.equalsIgnoreCase(B)){
			System.out.println("\nWow, '"+aRaw+"' is a palindrome!");
			isPalindrome = true;
		} else {
			System.out.println("\nSorry, '"+aRaw+"' isn't a palindrome.");
			isPalindrome = false;
		}
		return isPalindrome;
	}
}