package code;

import java.util.Scanner;

public class MainDrive {

	public static void main(String[] args) {

//		문제를 출제하는 세자리 숫자가 담긴 배열
		int[] questionArr = new int[3];
//		사용자가 입력한 세자리 숫자를 쪼개서 담을 배열
		int[] userInputNumArr = new int[3];

		Scanner scan = new Scanner(System.in);

//		3자리 숫자를 저장하는 반복문
		for (int i = 0; i < questionArr.length; i++) {

//			 중복 검사를 통과 해야만 while에서 탈출
			while (true) {
				
//				1~9 사이의 값을 랜덤으로 추출
				int randomNum = (int) (Math.random() * 9 + 1);

//				문제 배열안에 이미 담겨있는값이면 중복 통과 실패. false.
				boolean isDuplOk = true;
				for (int num : questionArr) {
					if (randomNum == num) {
						isDuplOk = false;
						break;
					}
				}

//				중복통과가 true면 배열에 담고, 값을 출력, while 탈출
				if (isDuplOk) {
					questionArr[i] = randomNum;
					System.out.println(randomNum);
					break;
				}
			}

		}

		
		
//		몇번만에 맞췄는지 기록하기 위한 변수
		int inputCount = 0;
		
//		3S를 달성해야 게임이 종료.
		while (true) {
			System.out.print("세자리 숫자를 입력 : ");
			int inputNum = scan.nextInt();
			
//			한번 더 입력했다고 기록.
			inputCount++;

//			386 => 3? 8? 6?
			userInputNumArr[0] = inputNum / 100;
			userInputNumArr[1] = inputNum / 10 % 10;
			userInputNumArr[2] = inputNum % 10;
			
//			?S ?B인지 판단하는 로직.
			int strikeCount = 0;
			int ballCount = 0;

			for (int i = 0; i < questionArr.length; i++) {
				for (int j = 0; j < userInputNumArr.length; j++) {

//					적혀있는 숫자가 같은지 우선 비교
					if (questionArr[i] == userInputNumArr[j]) {
//						같은 숫자를 찾았을때 위치도 같은지
						if (i == j) {
							strikeCount++;
						} else {
							ballCount++;
						}
					}
				}
			}
		}
		
		
	}
	
}
