package problems;

import javax.swing.JOptionPane;
public class PrintIntIf {

	public static void main(String[] args) {
		int i = -1;
		while(i==-1) {
			String str = JOptionPane.showInputDialog("Type an integer 0-10");
			i = Integer.parseInt(str);
			if(i == 0) {
				System.out.println("Zero.");
				break; }
			else if(i == 1) {
				System.out.println("One.");
				break; }
			else if(i == 2) {
				System.out.println("Two.");
				break; }
			else if(i == 3) {
				System.out.println("Three.");
				break; }
			else if(i == 4) {
				System.out.println("Four.");
				break; }
			else if(i == 5) {
				System.out.println("Five.");
				break; }
			else if(i == 6) {
				System.out.println("Six.");
				break; }
			else if(i == 7) {
				System.out.println("Seven.");
				break; }
			else if(i == 8) {
				System.out.println("Eight.");
				break; }
			else if(i == 9) {
				System.out.println("Nine.");
				break; }
			else if(i == 10) {
				System.out.println("Ten.");
				break; }
			else {
				System.out.println("Invalid integer. Choose an integer 0-10.");
				i = -1;
			}
		}
	}

}
