package day04.com.ict.edu;

public class Homework01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println((int)(Math.random()*10));
		
		System.out.println((int)(Math.pow(2, 3)));
		
		System.out.println((int)(Math.sqrt(36)));
	
		System.out.println(Math.abs(-22));
		
		System.out.println((int)(Math.ceil(20.3)));
		
		System.out.println((int)(Math.floor(20.6)));
		
		System.out.println(Math.round(10.5));
		
		System.out.println(Math.sin(270.0));
		
		System.out.println(Math.toRadians(90));
		//라디안 = 원의 호의 길이 / 원의 반지름
		//1 rad = 180도/PI      1도 = PI / 180 rad
		//PI 라디안은 180도
		
	
		System.out.println(Math.toDegrees(Math.PI));
		// 1 rad = 57.2958..
		
		
		System.out.println((int)(Math.PI*10000));
		
		/*
		 * #report 1
			💩
			#report
			1. Math 10개 조사하기
			1. Math.abs(a)
			입력된 a의 절댓값을 구하는 메서드입니다.
			ex) Math.abs(-12); >도출된 값은 12
			2. Math.ceil(a)
			입력된 a의 소수점 첫째 자리에서 올림 한 값을 반환하는 메서드입니다.
			ex) Math.ceil(12.3); >도출된 값은 13.0
			3. Math.floor(a)
			입력된 a의 소수점 첫째 자리에서 버림 한 값을 반환하는 메서드입니다.
			ex) Math.floor(12.6); >도출된 값은 12.0
			4. Math.round(a)
			입력된 a 의 소수점 첫째 자리에서 반올림한 값을 반환하는 메서드입니다.
			ex) Math.round(12.3) > 도출된 값은 12
			→ ceil, floor, round 모두 소수점 이하를 버리기 때문에 소수점 n째 자리까지 표현하기 위해
			서는 별도 계산을 해주어야합니다.
			5. Math.pow(a,b)
			입력된 a를 b제곱합 값을 반환하는 메서드입니다.
			ex) Math.pow(3,3); > 도출된 값은 27.0
			1. Math 10개 조사하기
			#report 2
			6. Math.sqrt(a)
			입력된 a의 제곱근을 반환하는 메서드입니다
			ex) Math.sqrt(16); >도출된 값은 4.0
			7. Math.random()
			0.0 이상 1.0 미안의 임의의 실수 값을 반환하는 메서드입니다.
			이때 반환하는 값의 범위를 지정한다면, 반환하고자 하는 값을 계산해주어야합니다.
			예를들어 1이상 100 이하의 자연수 중 임의의 값을 선택하고자 할 때는 Math.random() 함
			수가 0.0 “이상” 의 값을 반환하므로 결과에 번환범위의 최솟값을 더 해주어야합니다. 그리
			고 Math.random() 함수가 1.0 “미만”의 값을 반환하므로 반환범위의 “최댓값 +1”을 곱해주
			어야합니다.
			+1이 없으면 반환범위의 최대값은 출력되지않습니다.
			0부터 1보다 작은 실수 중 랜덤으로 하나를 반환한다.
			인수는 받지않느다 > () 괄호안의 숫자는 아무것도 넣지않늗나.
			가위바위보 프로그램과 같이 랜덤으로 어떤 결과물을 출력할 때 사용하기도한다.
			8. Math.exp()
			주어진 값의 자연로그(e)를 밑으로하는 지수 함수 값을 반환합니다. 이 메서드는 double 타
			입의 매개변수를 받습니다.
			9. Math.sin(double a)
			인수의 사인값을 구해줌.
			10. Math.cos(double a)
			인수의 코사인값을 구해줌
			11. Math.tan(double a)
			인수의 탄젠트값을 구해줌.
			#report 3
			12. Math.rint(double a)
			주어진 double값과 가장 가까운 정수 값을 double형으로 반환함.
			13. math.perm(n, k=None)
			반복 없고 순서 있게 n 개의 항목에서 k 개의 항목을 선택하는 방법의 수를 반환합니다.
			k <= n이면 n! / (n - k)! 로 평가되고, k > n이면 0으로 평가됩니다.
			k가 지정되지 않거나 None이면, k의 기본값은 n이고 함수는 n! 을 반환합니다.
			인자 중 어느 하나라도 정수가 아니면 TypeError를 발생시킵니다. 인자 중 어느 하나라도 음
			수이면 ValueError를 발생시킵니다.
			14. math.nextafter(x, math.copysign(math.inf, x))는 0에서 멀어집니다.
			15. math.isfinite(x)
			x가 무한대나 NaN이 아니면 True를, 그렇지 않으면 False를 반환합니다. (0.0은 유한한 것
			으로 간주합니다.)
			16. math.isinf(x)
			x가 양 또는 음의 무한대이면 True를, 그렇지 않으면 False를 반환합니다.
			17. math.isnan(x)
			x가 NaN(not a number)이면 True를, 그렇지 않으면 False를 반환합니다.
			18. math.lcm(integers)
			지정된 정수 인자의 최소 공배수를 반환합니다. 모든 인자가 0이 아니면, 반환 값은 모든 인
			자의 배수인 가장 작은 양의 정수입니다. 인자 중 어느 하나가 0이면, 반환 값은 0입니다. 인
			자가 없는 lcm()은 1을 반환합니다.
			19. math.ldexp(x, i)
			x(2*i)를 반환합니다. 이것은 본질적으로 함수 frexp()의 역입니다.
			#report 4
			20. math.nextafter(x, y)
			y를 향한 x 다음의 부동 소수점 값을 반환합니다.
			x가 y와 같으면, y를 반환합니다
			21. math.lcm(integers)
			지정된 정수 인자의 최소 공배수를 반환합니다. 모든 인자가 0이 아니면, 반환 값은 모든 인
			자의 배수인 가장 작은 양의 정수입니다. 인자 중 어느 하나가 0이면, 반환 값은 0입니다. 인
			자가 없는 lcm()은 1을 반환합니다.
			22. math.nextafter(x, math.inf)는 올라갑니다: 양의 무한대를 향해.
			23. math.nextafter(x, -math.inf)는 내려갑니다: 음의 무한대를 향해.
			24. math.nextafter(x, 0.0)는 0을 향합니다.
			25. math.prod(iterable,, start=1)
			입력 이터러블(iterable)에 있는 모든 요소의 곱을 계산합니다. 곱의 기본 start 값은 1입
			니다.
			iterable이 비어 있으면, start 값을 반환합니다. 이 함수는 숫자 값과 함께 사용하기 위
			한 것으로, 숫자가 아닌 형을 거부 할 수 있습니다.
			26. Math.cbrt(x)
			x의 세제곱근을 반환함.
			27. Math.clz32(x)
			x을 32비트 이진수로 변환한 후, 0이 아닌 비트의 개수를 반환함.
			28. Math.fround(x)
			x와 가장 근접한 32비트 부동 소수점 수(single precision float)를 반환함.
			29. Math.hypot(x, y, ...)
			#report 5
			인수로 전달받은 값들을 각각 제곱한 후 더한 총합의 제곱근을 반환함.
			30. Math.imul(x, y)
			인수로 전달받은 두 값의 32비트 곱셈의 결과를 반환함.
			31. Math.log(x)
			x의 자연로그 값을 반환함. (ln x)
			32. Math.trunc(x)
			x의 모든 소수 부분을 삭제하고 정수 부분만을 반환함.
			33. Math.signum() - 매개변수가 양수일 경우 1.0을, 음수일 경우 -1.0을 반환한다.
			34. Math.scalb() - 첫 번째 매개변수 * 2^두 번째 매개변수 값을 구한다.
		 */
		
		
		
	}

}
