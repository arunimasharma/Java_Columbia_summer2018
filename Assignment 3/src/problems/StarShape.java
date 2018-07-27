package problems;

public class StarShape {

	public static void main(String[] args) {
		int a, b;
		for(a=1; a<4; a++) {
			for(b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(; a>0; a--) {
			for(b=0; b<a; b++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}