/*Q.2588 
(�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
   472 ---(1)
X  385 ---(2)
------------- 
  2360 ---(3)
 3776  ---(4)
1416   ---(5)
-------------
181720 ---(6)
(1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� 
(3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
package ch1;
import java.util.Scanner;
public class Q1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * (b % 10)); // b�� 10���� ���������� ������ = b�� 1�� �ڸ�
		System.out.println(a * ((b % 100) / 10)); // b�� 100���� ���������� �������� 10���� ���� �� = b�� 10�� �ڸ�
		System.out.println(a * (b / 100)); // b�� 100���� ���� �� -> b�� 100�� �ڸ�
		System.out.println(a * b);

	}

}