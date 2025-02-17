package collectionTest.arrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListTest {

	public static void main(String[] args) {
//		<?> : 제네릭 - 포괄적인, 이름이 없는

		ArrayList<Integer> datas = new ArrayList<Integer>();
		
		System.out.println(datas.size());
		datas.add(10);
		datas.add(30);
		datas.add(50);
		datas.add(60);
		datas.add(40);
		datas.add(20);
		datas.add(70);
		datas.add(80);
		datas.add(90);
		System.out.println(datas.size());
		
		try {
			datas.get(0);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 처리 올바르게 할것");
		} catch (Exception e) {
			System.out.println("알 수 없는 오류");
		}
		
//		모든 데이터 확인
//		for 반복문
//		for(int i = 0; i < datas.size(); i++) {
//			datas.get(i);
//		}
		System.out.println(datas);
		Collections.shuffle(datas);
		System.out.println(datas);
//		실습
//		추가 (삽입)
//		50 뒤에 500을 삽입
		if(datas.contains(50)) {
			try {
				datas.add(datas.indexOf(50) + 1, 500);	
			} catch (IndexOutOfBoundsException e) {
				System.out.println("인덱스 관리 X");
			} catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		System.out.println(datas);
		
//		수정 (90 -> 9)
		int prev = 0;
		try {
			prev = datas.set(datas.indexOf(90), 9); // set은 리턴값이 있다. 
			System.out.println("변경 전 값 : " + prev);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과 에러");
		} catch (Exception e) {
			
		}
		
//		datas.replaceAll(n -> n == 90 ? 9 : n);
		System.out.println(datas);
		
//		삭제
//		80을 인덱스로 삭제
		prev = 0;
		try {
			prev = datas.remove(datas.indexOf(80));
			System.out.println("삭제된 값 : " + prev);
			
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과 에러");
		} catch (Exception e) {
			
		}
		System.out.println(datas);
		
//		80을 값으로 삭제
//		datas.removeIf(n -> n == 80);
		boolean bPrev = false;
		try {
//			Wrapper 랩퍼 클래스
//			작은 것을 큰 것으로 감싸는 것
			bPrev = datas.remove(Integer.valueOf(80)); 
			System.out.println("삭제 여부 : " + bPrev);
		} catch (IndexOutOfBoundsException e) {
			System.out.println("인덱스 범위 초과 에러");
		} catch (Exception e) {
			
		}
		System.out.println(datas);
  
	}
}



