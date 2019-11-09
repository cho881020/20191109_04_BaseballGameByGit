package code;

public class MainDrive {

	public static void main(String[] args) {

//		문제를 출제하는 세자리 숫자가 담긴 배열
		int[] questionArr = new int[3];
		

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

		
	}
	
}
