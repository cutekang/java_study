package anonymousTest;

// 실습
// 잠실점 오픈
// 무료나눔 행사 중
// 무료나눔 행사 중이라면, "무료나눔 행사 승인" 출력
// 무료나눔 행사 중이 아니라면, 판매
public class Building {

	public static void main(String[] args) {
		Starbucks gangnam = new Starbucks("강남점", false);
		Starbucks jamsil = new Starbucks("잠실점", true);
		
		gangnam.register(new FormAdapter() {
			@Override
			public void checkFreeDrink() {
				if(gangnam.getFreeDrinkEvent())
					System.out.println(gangnam.getName() + "무료나눔 행사 승인");
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						if(gangnam.getFreeDrinkEvent()){
							System.out.println(menus[i] + " 무료 나눔 완료");
							break;
						}
						else {
							System.out.println(menus[i] + " 판매 완료");
							break;
						}
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "카페라떼", "에이드", "디카페인"};
			}
		});
		
		jamsil.register(new FormAdapter() {
			@Override
			public void checkFreeDrink() {
				if(jamsil.getFreeDrinkEvent())
					System.out.println(jamsil.getName() + "무료나눔 행사 승인");
			}
			
			@Override
			public void sell(String menu) {
				String[] menus = getMenus();
				for(int i = 0; i < menus.length; i++) {
					if(menus[i].equals(menu)) {
						if(jamsil.getFreeDrinkEvent()){
							System.out.println(menus[i] + " 무료 나눔 완료");
							break;
						}
						else {
							System.out.println(menus[i] + " 판매 완료");
							break;
						}
					}
				}
			}
			
			@Override
			public String[] getMenus() {
				return new String[] {"아메리카노", "디카페인"};
			}
		});
	}
}
