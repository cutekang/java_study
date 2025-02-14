package examPractice;

import java.util.Arrays;
import java.util.Objects;

public class Researcher extends Person{

	private String[] lotto;
	private String search;
	
	public String[] getLotto() {
		return lotto;
	}
	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}
	public String getSearch() {
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	public Researcher() {;}
	public Researcher(String name, int age, String phone, String search) {
		super.setId(2);
		super.setAge(age);
		super.setName(name);
		super.setPhone(phone);
		super.setJob("연구원");
		setLotto(new String[6]);
		setSearch(search);
		
//		work();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(search);
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Researcher other = (Researcher) obj;
		return Objects.equals(search, other.search) && Arrays.equals(lotto, other.lotto);
	}
	@Override
	public String toString() {
		return "Researcher [lotto=" + Arrays.toString(lotto) + ", company=" + search + "]";
	}
	
	@Override
	public void work() {
		System.out.println("연구원은 " + getSearch() + "중 이다");
	}
	
	@Override
	public void checkLotto(String[] luckyNums) {
		int checkCount = 0;
		boolean win = false;
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < 6; j++) {
				if(getLotto()[i].equals(luckyNums[j])){
					checkCount++;
					break;
				}
			}
		}
		
		win = checkCount == 6;
		
		investLab(win);
		buyFood(win);
	}
	
	public void investLab(boolean winning) {
		String result = "";
		
		if(winning) {
			result = "연구에 투자한다";
		}
		else {
			result = "나에게 투자한다";
		}
		System.out.println(result);
	}
	
	public void buyFood(boolean winning) {
		String result = "";
		
		if(winning) {
			result = "지인에게 밥을 산다";
		}
		else {
			result = "집에 쌀을 산다";
		}
		System.out.println(result);
	}
}
