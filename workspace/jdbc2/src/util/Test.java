package util;

import java.sql.Connection;
import java.util.List;

import menu.MenuDTO;
import menu.MenuVO;

public class Test {
	public static void main(String[] args) {
		// menuDAO -> selectAll() 테스트
		menu.dao.MenuDAO MD= new menu.dao.MenuDAO();
		
		List<MenuDTO>list = MD.selectAll();
		System.out.println(list);
		
		// insert() 테스트
		String name = "콜드브루";
		if(MD.checkMenu(name)) { // true가 떴다면 이름 중복!
			System.out.println("메뉴이름 " + name +"은(는) 중복됩니다.");
		}
		else {
			MD.insert(new MenuVO(5, name, 4500));
			list = MD.selectAll();
			System.out.println(list);
		}
//		if(MD.insert(new MenuVO(4, "자몽허니블랙티", 4500))==1) {
//			System.out.println("추가 성공");
//			list = MD.selectAll();
//			System.out.println(list);
//		}
		// update() 테스트
//		System.out.println(MD.update(new MenuVO(4, "녹차프라푸치노", 5500))+ "행 변경");
//		
//		list = MD.selectAll();
//		System.out.println(list);
		
//		// delete() 테스트
//		if(MD.delete(1) == 1){
//			System.out.println("행 삭제 완료!");
//			list = MD.selectAll();
//			System.out.println(list);
//		}
//		else {
//			System.out.println("이미 삭제 완료!");
//			list = MD.selectAll();
//			System.out.println(list);
//		}
	}
}