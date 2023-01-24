package the_farm_story.com.greedy.thefarmstory;

public class FarmWorking {

public void signUpFarms() {
		
		FarmDTO[] works = new FarmDTO[3];
		works[0] = new FarmDTO(" 50000원 ", "경험치 50000 증가", " 전문성증가 +1");
		works[1] = new FarmDTO(" 50000원 ", "경험치 50000 증가", " 전문성증가 +1");
		works[2] = new FarmDTO(" 50000원 ", "경험치 50000 증가", " 전문성증가 +1");
		
		FarmInsertManager farmInsertManager = new FarmInsertManager();
		farmInsertManager.insert(works);
	}
}
