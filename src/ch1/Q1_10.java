//Q.10430 (A+B)%C�� ((A%C) + (B%C))%C �� ������?
//(A��B)%C�� ((A%C) �� (B%C))%C �� ������?
//�� �� A, B, C�� �־����� ��, ���� �� ���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
package ch1;
import java.util.Scanner;
public class Q1_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println((a+b)%c);
		System.out.println(((a%c) + (b%c))%c);
		System.out.println((a*b)%c);
		System.out.println(((a%c) * (b%c))%c);
	}
}