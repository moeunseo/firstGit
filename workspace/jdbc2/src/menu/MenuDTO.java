package menu;

// 보통 select(조회)할 때 사용하는 클래스
public class MenuDTO {
	private String menuName;
	private int menuPrice;
	
	public MenuDTO() {;}

	public MenuDTO(String menuName, int menuPrice) {
		this.menuName = menuName;
		this.menuPrice = menuPrice;
	}

	public String getMenuName() {
		return menuName;
	}

	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public void setMenuPrice(int menuPrice) {
		this.menuPrice = menuPrice;
	}
	
	@Override
	public String toString() {
		return "MenuDTO [menuName=" + menuName + ", menuPrice=" + menuPrice + "]";
	}
}
