package lambdaTask2;

// 문자열과 문자형을 전달하면 해당 문자의 개수를 구해주는 람다 구현 PrintString, strCount()
@FunctionalInterface
public interface PrintString {
	public int strCount(String strInput, char charSearch);
}
