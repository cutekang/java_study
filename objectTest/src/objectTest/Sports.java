package objectTest;

import java.util.Objects;

public class Sports {
// 	1. 기본생성자
//	2. 초기화 생성자
//	3. private 붙이기
//	4. getter, setter
//	5. toString() 재정의
//	6. hashcode, equals 재정의
	
	
//	alt + shift + a : 화면 그리드 모드
	private String type;
	private int total;
	
//	alt + shift + s -> alt + r -> a -> r : getter, setter 단축키
	
//	alt + shift + s -> o
	public Sports() {;}

	@Override
	public String toString() {
		return "Sports [type=" + type + ", total=" + total + ", toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(total, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sports other = (Sports) obj;
		return total == other.total && Objects.equals(type, other.type);
	}

	public Sports(String type, int total) {
		this.type = type;
		this.total = total;
	}

//	alt + shift + s -> s : toString 오버라이드

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public static void main(String[] args) {
		Sports sports = new Sports();
//		System.out.println(sports.hashCode());
		
//		필드 값의 확인을 위한 용도
		System.out.println(sports.toString());
//		sports.equals(sports);
		
	}
}
