package abstractTest;

public class WashingMachine extends Electronics{

	@Override
	public void off() {
		System.out.println("버튼 눌러서 전우너 켜기");
	}
	
	@Override
	public void on() {
		System.out.println("버튼 눌러서 전원 끄기");
	}
}
