package anonymousTest;

public class Starbucks {
	
	private boolean freeDrinkEvent;
	private String name;
	{
		name = "";
		freeDrinkEvent = false;
	}
	
	public Starbucks() {
		
	}
	public Starbucks(String name, boolean freeDrinkOpen) {
		setValue(name, freeDrinkOpen);
	}
	
	public void setValue(String name, boolean eventOpen) {
		this.name = name;
		freeDrinkEvent = eventOpen;
	}
	public boolean getFreeDrinkEvent() {
		return freeDrinkEvent;
	}
	public String getName() {
		return name;
	}
	
	public void register(Form form) {
//		판매 중인 곳인지, 무료나눔행사 중 인 곳인지 판별
		form.checkFreeDrink();
		
		String [] menu = form.getMenus();
		for(int i = 0; i < menu.length; i++) {
			System.out.println(i + 1 + ". " + menu[i]);
		}
		
		form.sell("아메리카노");
	}
}
