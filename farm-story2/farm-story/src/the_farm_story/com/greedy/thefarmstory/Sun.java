package the_farm_story.com.greedy.thefarmstory;

import java.util.Scanner;

public class Sun extends Worker {
	
	public void work2() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. 소에게 밥을준다.");
		System.out.println("2. 개에게 밥을준다.");
		System.out.println("3. 깨를 턴다.");
		System.out.println("4. 밭에 씨를 뿌린다.");
		System.out.println("5. 물건을 판매한다.");
		int number = scanner.nextInt();
	}
}
