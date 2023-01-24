package the_farm_story.com.greedy.thefarmstory;

public class FarmInsertManager {


	public void insert(FarmDTO[] works) {
		
		System.out.println("경험치, 돈, 전문성을 얻습니다.");
		
		for(int i = 0; i < works.length; i++) {
			System.out.println(works[i].getExp() + works[i].getMoney() + works[i].getPro() + "획득 했습니다.");
		}
		System.out.println("총 " + works.length + "가지를 획득했습니다.");
		
	}
}

