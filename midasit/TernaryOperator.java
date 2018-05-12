package midasit;
/*
 * 
 * 
 * 
 * 삼항 연산자 (TernaryOperator)

C++, Java 등의 프로그래밍 언어 에서는 ‘?’, ‘:’ 키워드를 사용하여 아래와 같은 형식의 삼항 연산자(조건 연산자)를 제공합니다. 
condition이 true이면 연산자는 expr1의 값을 반환하며, false이면 expr2를 반환합니다.

condition ? expr1 : expr2

삼항 연산자 표현식을 수행했을 때 반환되는 결과값을 출력하는 프로그램을 작성해 주시기 바랍니다.

이번 문제에서 condition은 두 개의 자연수와 하나의 비교연산자로만 이루어져 있으며, expr1과 expr2는 자연수 이거나 또 다른 삼항 연산자 표현식입니다. 
(중첩 삼항 연산자) 연산자를 표현할 때 괄호 ‘(‘, ‘)’는 사용하지 않습니다. 자연수의 범위는 1<=N<=999 이며, 사용되는 비교연산자 종류는
 ==, !=, >, <, >=, <= 입니다. 입력된 표현식은 오류가 아닌 경우 자연수를 반환합니다.

예를 들어, 1!= 2 ? 3 > 4 ? 5 >= 6 ? 7 : 8 == 9 ? 10 : 11 : 12 : 13 의 반환 값은 12 입니다.
풀이 과정은 아래와 같습니다.

     1!= 2 ? 3 > 4 ? 5 >= 6 ? 7 : 8 == 9 ? 10 : 11 : 12 : 13
 1!= 2 ? 3 > 4 ? 5 >= 6 ? 7 : (8 == 9 ? 10 : 11) : 12 : 13
 1!= 2 ? 3 > 4 ? (5 >= 6 ? 7 : 11) : 12 : 13
 1!= 2 ? (3 > 4 ? 11: 12) : 13
 1!= 2 ? 12 : 13
 12

입력

입력은 표준 입력(stdin)으로 주어지며, 첫째 줄에 삼항 연산자 표현식이 주어집니다.
표현식은 문자열로 표현하며 연산자와 피연산자 사이는 공백으로 구분됩니다.
입력 문자열의 최대 길이는 10000 입니다.

출력

출력은 표준 출력(stdout)으로 이루어집니다.
첫째 줄에 삼항 연산자 반환값을 출력합니다.
입력된 삼항 연산자 표현식에 오류가 있어서 반환값을 알 수 없는 경우 -1을 출력합니다.

<예1>
입력
1 > 2 ? 3 : 4 > 5 ? 6 : 7

출력
7

<예2>
입력
33 != 1 ? 13 > 35 ? 4 >= 5 ? 0 : 4 == 2 ? 13 : 4 : 23 : 2

출력
23
 */
public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
