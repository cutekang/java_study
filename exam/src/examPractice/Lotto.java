package examPractice;

import java.util.Objects;

public class Lotto {
	private static String[] luckyNums;
	private int id;
	
	public static String[] getLuckyNums() {
		return luckyNums;
	}
	public static void setLuckyNums(String[] luckyNums) {
		Lotto.luckyNums = luckyNums;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Lotto() {;}
	public Lotto(int id) {
		setId(id);
		setLuckyNums(new String[6]);
	}

	@Override
	public String toString() {
		return "Lotto [id=" + id + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lotto other = (Lotto) obj;
		return id == other.id;
	}
	/***
	 * 당첨을 확인하려면, 추첨 번호를 1~6까지의 수로만 만들고
	 * sellLotto 의 번호도 1~6까지의 수로 만들면 확인이 가능합니다.
	 */
	public void drawNumber() {
		String[] numbers = new String[6];
		
		for(int i = 0; i < 6; i++) {
			numbers[i] = String.valueOf((int)(Math.random() * 45 + 1));
			
			for(int j = 0; j < i; j++) {
				if(numbers[j].equals(numbers[i])) {
					i--;
					break;
				}
			}
		}
		setLuckyNums(numbers);
	}
	
	/***
	 * 당첨을 확인하려면, 추첨 번호를 1~6까지의 수로만 만들고
	 * sellLotto 의 번호도 1~6까지의 수로 만들면 확인이 가능합니다.
	 */
	public void sellLotto(Person person) {
		String className = String.valueOf(person).split(" ")[0];
		String[] numbers = new String[6];
		
		for(int i = 0; i < 6; i++) {
			numbers[i] = String.valueOf((int)(Math.random() * 45 + 1));
			
			for(int j = 0; j < i; j++) {
				if(numbers[j].equals(numbers[i])) {
					i--;
					break;
				}
			}
		}
		switch(className) {
			case "Researcher":
				((Researcher) person).setLotto(numbers); 
				break;
			case "Employee":
				((Employee) person).setLotto(numbers);
				break;
			default:
				System.out.println("로또를 구매할 수 없습니다.");
				break;
		}
	}
	
	public static void main(String[] args) {
		Lotto lotto = new Lotto();
		
		Employee A = new Employee("일당백", 20, "01077776666", "IT");
		Researcher B = new Researcher("한우물", 35, "01044467878", "식물연구");
		
		Person[] people = {
			A,
			B
		};
		
		//로또 번호 추첨
		lotto.drawNumber();
		System.out.println("이번주 로또 추첨 번호");
		for(int i = 0; i < 6; i++) {
			System.out.print(getLuckyNums()[i] + " ");
		}
		System.out.print("\n");
		
		//로또 판매
		for(int i = 0; i < people.length; i++) {
			lotto.sellLotto(people[i]);
		}
		System.out.println();
		
		//출력 확인을 위한 추가
		String completeSellLotto = "";
		completeSellLotto = A.getJob() + " " + A.getName() + " 씨의 로또 번호는 "; 
		for(int i = 0; i < 6; i++) {
			
			completeSellLotto += A.getLotto()[i] + " ";
		}
		System.out.println(completeSellLotto);
		
		completeSellLotto = "";
		completeSellLotto = B.getJob() + " " + B.getName() + " 씨의 로또 번호는 ";
		for(int i = 0; i < 6; i++) {
			
			completeSellLotto += B.getLotto()[i] + " ";
		}
		System.out.println(completeSellLotto);
		
		//로또 확인
		System.out.println(A.getName() + "씨는..");
		A.checkLotto(getLuckyNums());
		
		System.out.println(A.getName() + "씨는..");
		B.checkLotto(getLuckyNums());
	}
	
}
