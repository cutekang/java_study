package lambdaTask;

// 성과 이름을 전달하면 전체 이름을 만들어주는 메서드
@FunctionalInterface
public interface PrintName {
	public String TotalName(String lastName,String firstName);
}
