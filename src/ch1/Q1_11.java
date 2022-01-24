/*Q.2588 
(세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
   472 ---(1)
X  385 ---(2)
------------- 
  2360 ---(3)
 3776  ---(4)
1416   ---(5)
-------------
181720 ---(6)
(1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 
(3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오. */
package ch1;
import java.util.Scanner;
public class Q1_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a * (b % 10)); // b를 10으로 나눴을때의 나머지 = b의 1의 자리
		System.out.println(a * ((b % 100) / 10)); // b를 100으로 나눴을때의 나머지를 10으로 나눈 몫 = b의 10의 자리
		System.out.println(a * (b / 100)); // b를 100으로 나눈 몫 -> b의 100의 자리
		System.out.println(a * b);

	}

}