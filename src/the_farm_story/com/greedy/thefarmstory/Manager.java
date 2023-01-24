package the_farm_story.com.greedy.thefarmstory;

public class Manager extends Work{

	@Override
	public void work() {
		System.out.println("일을 시작합니다.");
	}
	
	public static void give1() {
		System.out.println("소에게 먹이를 줍니다.");
	}
	
	public static void give2() {
		System.out.println("개에게 먹이를 줍니다.");
	}
	
	public static void seed() {
		System.out.println("밭에 나가서 씨를 뿌립니다.");
	}
	
	public static void cut() {
		System.out.println("밖에서 깨를 털기 합니다.");
	}
	public static void sell2() {
		System.out.println("물건을 팔았습니다.");
	}

}
