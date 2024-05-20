package java_ch04_240510;

public class ForTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=10;i++) {
			System.out.println(i);
		}
		
		for(int j=1;j<=100;j=j+2) {
			System.out.println(j);
		}
		
		for(int k=100;k>=1;k--) {
			System.out.println(k);
		}
		// 1~100까지 합을 출력하는 반복문을 작성하시오.
		int sum = 0;  // sum 정수 변수를 선언과 동시에 0으로 초기화
		for(int i=1; i<=100; i++) {
			sum = sum + i;
		}System.out.println(sum);
		
		// for 문을 이용해서 1부터 100까지의 정수 중에서 3의 배수의 총합을 구하는 코드 작성
		int three = 0;
		for(int i=3; i<100; i=i+3) {
			three = three+i;
		}
		System.out.println("방법1) 1부터 100까지 3의 배수들의 합:"+three);
		
		int three1 = 0;
		for(int i=1; i<=100; i++) {
			if (i%3 == 0) {
				three1 = three1 + i;
			}
		}
		System.out.println("방법2) 1부터 100까지 3의 배수들의 합:" + three);
		
	}

}
