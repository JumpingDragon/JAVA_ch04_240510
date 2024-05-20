package java_ch04_240510;

public class WhileTest01 {

	public static void main(String[] args) {
		int i = 1;
		while(i<=1000) {
			System.out.println("집에가고싶다");
			i++;
		}

		int j = 1;
		while(true) {
			System.out.println("집에가고싶다");
			j++;
			if(j==100) {
				break;
			}
		}
		
		do {
			System.out.println("안");
		} while(false);
		
		
		
		for(int k=1;k<=10;k++) {
			if(k%3==0) {
				continue;
			}
			System.out.println(k);
		}

	}

}
