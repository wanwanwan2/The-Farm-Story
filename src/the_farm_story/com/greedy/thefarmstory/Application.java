package the_farm_story.com.greedy.thefarmstory;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {

		/* 간단한 농장에서 일하는 게임 프로그램 */

		Scanner sc = new Scanner(System.in);
		FarmWorking user = new FarmWorking();

		while (true) {
			System.out.println("===== The Farm story =====");
			System.out.println("1. 일을 시키겠습니까?");
			System.out.println("2. 졸업하시겠습니까?");
			int Work1 = sc.nextInt();

			switch (Work1) {
			case 1:
				System.out.println("일을 시킬 사람을 선택해주세요.");
				System.out.println("1. 아들" + " 2. 직원");
				break;
			case 2:
				System.out.println("2. 누구를 졸업시키겠습니까?");
				System.out.println("1. 아들" + " 2. 직원");
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}
			int what = sc.nextInt();

			switch (what) {
			case 1:
				System.out.println("1. 소밥을 준다.");
				Manager.give1();
				user.signUpFarms();
				break;
			case 2:
				System.out.println("2. 개밥을 준다.");
				Manager.give2();
				user.signUpFarms();
				break;
			case 3:
				System.out.println("3. 밭에 나가서 씨를 뿌립니다.");
				Manager.seed();
				user.signUpFarms();
				break;
			case 4:
				System.out.println("4. 깨를 텁니다.");
				Manager.cut();
				user.signUpFarms();
				break;
			case 5:
				System.out.println("5. 물건을 판매합니다.");
				Manager.sell2();
				user.signUpFarms();
				break;
			default:
				System.out.println("번호를 잘못 입력하셨습니다.");
				break;
			}

		}

	}
}
