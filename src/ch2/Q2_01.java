//Q.1330 �� �� ���ϱ�
package ch2;
import java.util.Scanner;
public class Q2_01 {
	public static void main(String[] args) {
		//System.out.println("���� �� ���� �Է� : ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a>b) {
			System.out.println(">");
		}
		else if(a<b) {
			System.out.println("<");
		}
		else System.out.println("==");

	}
}
