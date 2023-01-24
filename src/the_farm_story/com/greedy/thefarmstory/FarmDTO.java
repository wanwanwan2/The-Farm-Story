package the_farm_story.com.greedy.thefarmstory;

public class FarmDTO {

	private String money;
	private String exp;
	private String pro;
	
	public FarmDTO() {}
	
	public FarmDTO(String money, String exp, String pro) {
		super();
		this.money = money;
		this.exp = exp;
		this.pro = pro;


	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getExp() {
		return exp;
	}

	public void setExp(String exp) {
		this.exp = exp;
	}

	public String getPro() {
		return pro;
	}

	public void setPro(String pro) {
		this.pro = pro;
	}

}