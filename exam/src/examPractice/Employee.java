package examPractice;

import java.util.Arrays;
import java.util.Objects;

public class Employee extends Person{

	private String[] lotto;
	private String company;
	
	public String[] getLotto() {
		return lotto;
	}
	public void setLotto(String[] lotto) {
		this.lotto = lotto;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	public Employee() {;}
	public Employee(String name, int age,  String phone, String company) {
		super.setId(1);
		super.setAge(age);
		super.setName(name);
		super.setPhone(phone);
		super.setJob("회사원");
		setLotto(new String[6]);
		setCompany(company);
		
//		work();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Arrays.hashCode(lotto);
		result = prime * result + Objects.hash(company);
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
		Employee other = (Employee) obj;
		return Objects.equals(company, other.company) && Arrays.equals(lotto, other.lotto);
	}
	@Override
	public String toString() {
		return "Employee [lotto=" + Arrays.toString(lotto) + ", company=" + company + "]";
	}
	
	@Override
	public void work() {
		System.out.println(getJob() + "은 하루종일 일을한다");
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
		
		byeCompany(win);
		saveMoney(win);
	}
	
	public void byeCompany(boolean winning) {
		String result = "";
		
		if(winning) {
			result = "직장을 그만둔다";
		}
		else {
			result = "다시 일한다";
		}
		System.out.println(result);
	}
	public void saveMoney(boolean winning) {
		String result = "";
		
		if(winning) {
			result = "전액을 저축한다";
		}
		else {
			result = "다시 돈 번다";
		}
		System.out.println(result);
	}
}
