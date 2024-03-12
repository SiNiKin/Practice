package Quiz;

import java.util.Arrays;
import java.util.Scanner;

public class Quiz_240312PM {

	public static void main(String[] args) {
		// 1. 소수(PrimeNumber) 구하기
		//   소수는 1과 자기 자신만으로 나누어지는 수를 말함. 
		//   조건문과 반복문을 사용하여 100이하의 소수를 출력해 보세요
		//   (for문 안에 for문)
		
		for (int i = 2; i < 100; i++) {
			int count = 0;
			for (int k = 1; k <= i; k++) {
				if(i % k == 0) {
					count += 1;
				}
			}
			if (count == 2) {
				System.out.print(i + " ");
			}
		}
		
		// 2. 단어 거꾸로 출력하기(reverse 출력)
		//   자바의 Scanner 객체를 이용하여 콘솔에 데이터를 입력
		//   입력된 데이터를 for문을 사용하여 거꾸로(reverse) 출력하세요
		//   (String.charAt(index)를 사용)
		
		Scanner scan = new Scanner(System.in);
//		String word = scan.next();
//		for (int i = word.length() -1; i >= 0; i--) {
//			word += word.charAt(i);
//		}
//		System.out.println(word);

		// 3. 로또 번호 추출하기
		//   앞서 배운 난수를 활용하여, 중복되는 번호 없이 1 ~ 45까지의 숫자 중
		//   6개의 숫자를 랜덤추출하고, 콘솔에 출력하세요. 
		//   (while문에 for)
		System.out.println();
		System.out.println("=========== 로또 추출 =============");
		int[] lotto = {0,0,0,0,0,0};
		
		int index = 0;
		while(true) {
			//랜덤값 생성
			int rand = (int)(Math.random()*45) + 1 ;	// 0 ~ 45
			int i = 0;	// index와 값을 비교하기 위해서...
			for (i = 0; i < index; i++) {
				if (rand == lotto[i]) {	// 추첨된 번호가 중복됨...
					break;
				}
			}
			if (index == i) {	// 추첨된 번호가 lotto에 없어요...
				lotto[index++] = rand;
			}
			if (index > 5) break;	// 6개 번호 추출 끝
		}
		
		
		// 결과 추출
		for (int i = 0; i < lotto.length; i++) {
			System.out.print(lotto[i] + "\t");
		}
		
		System.out.println();
		System.out.println("================================");
		
//		int lo_num = (int)(Math.random()*45)+1;
//		int[] lotto = new int[6];
//		
//		for (int i = 0; i < 6; i++) {
//			lotto[i] = (int)(Math.random()*45) + 1;	// 1 ~ 100 사이의 임의의 값!
//		}
//		
//		System.out.println(Arrays.toString(lotto));
		
		// 4. 대문자가 입력된다면 소문자로 출력하고, 
		//   소문자가 입력된다면 대문자로 출력하는 프로그램을 작성해보세요
		
		
		
		// 5. 커피의 가격은 2000원, 10개 이상 구매하면 초과분에 대해서 
		//   커피는 1500원을 받는다. 
		//   커피의 개수를 입력받고, 총 가격이 얼만인지 계산하여 출력하는 
		//   프로그램을 만들어보세요!
		
		System.out.print("몇잔 살거에여 ? ");
		int coffee = scan.nextInt();
		int ori_price = 2000;
		int plus = 1500;
		int sum1 = 0;
		int sum2 = 0;
		
		for(int i = 0; i < coffee; i ++) {
			if (coffee > 10) {
				sum1 = ori_price*10;
				sum2 = plus*(coffee-10);
			}else if(coffee <= 10) {
				sum1 = ori_price*coffee;
			}
		}
		
		System.out.println(coffee - 10 + " " + sum1);
		System.out.println("총 " + (sum1 + sum2) + "원 입니다.");
			
		
		// 6. 램덤으로 알파벳 대문자 50개 생성하여 출력하는 프로그램을 만들어 보세요. 
		//   출력은 10줄 마다 줄바꿈해서 출력되게 해주세요. 
		//   예> 	DEFDEGSDFE
		//       	ADEFSGESGS
		//          ...
		
		
		
	}

}