package problems;

import javax.swing.JOptionPane;

public class PalindromeDetect {

	public static void main(String[] args) {
		String compare = "";
		String palindrome = JOptionPane.showInputDialog("Type a word.");
		char[] letters = palindrome.toLowerCase().toCharArray();
		int numLetters = palindrome.length();
		for(int a = numLetters-1; a>=0; a= a-1) {
			compare = compare + letters[a];
		}
		if(compare.equals(palindrome.toLowerCase())) {
			System.out.println("The word \"" +palindrome+ "\" is a palindrome.");
		} else if(palindrome != compare) {
			System.out.println("The word \"" +palindrome+ "\" is not a palindrome.");
		}
	}

}
