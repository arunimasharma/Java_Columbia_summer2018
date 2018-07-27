package problems;

import java.lang.Math;
import java.text.DecimalFormat;

public class IntExponential {

	public static void main(String[] args) {
		int num = 10;
		double ans = Math.exp(num);
		DecimalFormat ft = new DecimalFormat(".##");
		System.out.println(ft.format(ans));
	}

}
