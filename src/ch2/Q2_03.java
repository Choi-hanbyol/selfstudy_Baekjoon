//Q.2753 À±³â
package ch2;
import java.util.Scanner;
public class Q2_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		
		if(year%4==0 && (year%100!=0 || year%400==0)) {
			System.out.println("1");
		}
		else System.out.println("0");

	}

}
