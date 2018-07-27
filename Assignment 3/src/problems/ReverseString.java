package problems;

import javax.swing.JOptionPane;

public class ReverseString {

	public static void main(String[] args) {
		String reverseThis = JOptionPane.showInputDialog("Type some words!");
		char[] letters = reverseThis.toCharArray();
		int numLetters = reverseThis.length();
		for(int a = numLetters-1; a>=0; a= a-1) {
			System.out.print(letters[a]);
		}
	}

}
