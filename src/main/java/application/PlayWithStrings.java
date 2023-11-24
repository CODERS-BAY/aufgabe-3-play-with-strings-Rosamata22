package application;
import java.util.Arrays;


public class PlayWithStrings {

	public static void main(String[] args) {
		String vorname = "Rodríguez";
		String nachname = "González";
		String a = "monja";
		String b = "jamon";
		String c = "acurruca";
		printIntitials(vorname, nachname);
		System.out.println("Anagrame: " + isAnagram(a,b));
		System.out.println("Palindrome: " + isPalindrome(c));
	}

	/**
	 * TODO: print initials
	 * 
	 * This method should print out the initials of a name to standard out.
	 * 
	 * @param firstname
	 * @param lastname
	 */
	public static void printIntitials(String firstname, String lastname) {
	System.out.println("first initial: %s, last initial: %s".formatted(firstname.substring(0,1),lastname.substring(0,1)));
	}

	/**
	 * TODO: check for anagrams
	 * 
	 * This method should determine if two strings are anagrams or not An anagram is
	 * a word or a phrase made by transposing the letters of another word or phrase.
	 * For example, "parliament" is an anagram of "partial men," and "software" is
	 * an anagram of "swear oft." The program should ignore white space and
	 * punctuation.
	 * 
	 * @param value1
	 * @param value2
	 * @return true if the values are anagrams, false otherwise.
	 */
	public static boolean isAnagram(String value1,String value2) {
		String low1 = value1.toLowerCase();
		String low2 = value2.toLowerCase();
		String cleanlow1 = low1.replaceAll(" ", "");
		String cleanlow2 = low2.replaceAll(" ", "");
		char[] arr1 = new char[low1.length()];
		arr1 = cleanlow1.toCharArray();
		char[] arr2 = new char[low2.length()];
		arr2 = cleanlow2.toCharArray();
		Arrays.sort(arr1, 0, arr1.length);
		Arrays.sort(arr2, 0, arr2.length);

		if (Arrays.equals(arr1, arr2)) {
			return true;
		}
		return false;
	}



	/**
	 * TODO: palindrone checker
	 * 
	 * This method should find out if a string value is a palindrome or not. A
	 * palindrome is a sequence of characters (can also be a number) which reads the
	 * same backwards as forwards. Some palindromes are: Anna; wow; Eva can I see
	 * bees in a cave?
	 * 
	 * Upper or lower case should not matter, but keep the white spaces, tabs and
	 * punctuation in mind.
	 * 
	 * @param value
	 * @return true if it is a palindrome, false otherwise.
	 */
	public static boolean isPalindrome(String value3) {
		char[] arr3 = new char[value3.length()];
		arr3 = value3.toCharArray();
		StringBuilder reversed = new StringBuilder();
		for (int i = arr3.length; i > 0; i--) {
			reversed.append(arr3[i - 1]);
		}
		String s = reversed.toString();
		char[] arr4 = new char[s.length()];
		arr4 = s.toCharArray();
		/** DIFERENTES MANERAS DE INVERTIR LOS VALORES DE UN ARRAY O STRING
		*otro metodo: StringBuilder builder = new StringBuilder(value).reverse();
		*       return value.equals(builder.toString());
        * otro metodo para reverse:arr4 = reversechararray(arr3);
		* otro metodo para reverse: public static char[] reverseCharArray(char[] array) {
		 char[] newArray = new char[array.length];
		 for(int i = 0; i < newArray.length; i++) {
		 newArray[i] = array[newArray.length - 1 - i];
		 }
		 return newArray;
		 */
		if (Arrays.equals(arr4, arr3)) {
			return true;
		}
		return false;
	}
}
