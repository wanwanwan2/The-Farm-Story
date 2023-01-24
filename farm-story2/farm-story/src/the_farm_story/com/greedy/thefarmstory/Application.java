package the_farm_story.com.greedy.thefarmstory;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/* 간단한 농장에서 일하는 게임 프로그램 */

		Scanner scanner = new Scanner(System.in);
		Worker worker = new Worker();

		System.out.println("===== The Farm story =====");
		System.out.println("1. 일을 시키겠습니까?");
		System.out.println("2. 졸업하시겠습니까?");
		System.out.println("메뉴를 선택하여주십시오.");
		int number = scanner.nextInt();

		if (number == 1) {
			System.out.println("누구를 일 시키겠습니까?");
			System.out.println("일을 시킬 사람을 선택해주세요.");
			System.out.println("1. 아들" + " 2. 직원");
		} else if (number == 2) {
			System.out.println("누구를 졸업시키겠습니까?");
			System.out.println("2. 누구를 졸업시키겠습니까?");
			System.out.println("1. 아들" + " 2. 직원");
		} else {
			System.out.println("번호를 잘못 입력하셨습니다.");
		}
		number = scanner.nextInt();
		
		if (number == 1) {
			System.out.println("아들이 일을 합니다.");
		} else if (number == 2) {
			System.out.println("직원이 일을 합니다.");
		} else {
			System.out.println("번호를 잘못 입력하셨습니다.");
		}
		while(true){
		System.out.println("==============");
		System.out.println("현재당신의 돈: " + Worker.money);
		System.out.println("현재당신의 경험치: " + Worker.exp);
		System.out.println("현재당신의 노력 : " + Worker.effort);
		System.out.println("==============");
		//일을 선택
		System.out.println("일을 선택 합니다.");
		System.out.println("1. 소밥을 준다.");
		System.out.println("2. 개밥을 준다.");
		System.out.println("3. 깨를 턴다.");
		System.out.println("4. 씨를 뿌린다.");
		System.out.println("5. 판매를 한다.");
		number = scanner.nextInt();
		
		if(number == 1) {
		FarmWork wk = new FarmWork();
		
		}
		}
	}
}