package day10_Collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test07_Map {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("java01", "1234");
		map.put("java02", "123*");
		map.put("java03", "12**");
		map.put("java04", "1***");
		map.put("java05", "**12");
		map.put("java06", "*234");
		map.put("java07", "12345678");
		map.put("java08", "1234567");
		map.put("java09", "123456");
		map.put("java10", "*1234*");
		map.put("java11", "**12**");
		map.put("java12", "**23**");
		map.put("java13", "**34**");
		map.put("java14", "*124*");
		map.put("java15", "*134");

		//System.out.println(map);//그냥 스트링
		//map 구조 순회
		
		Set<String> keys = map.keySet();//key값의 목록만 Set 구조로 뽑아주는 API
		Iterator<String> it = keys.iterator();
		while (it.hasNext()) {
			String id = (String) it.next();
			System.out.println(id+ " = " + map.get(id));
		}
		
		//System.out.println(map.get("java01"));
		//System.out.println(map.get("java00")); //존재하지 않는 key값 -> null
		//존재하지 않는 id, 회원가입 창으로
		
		//로그인 처리
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("ID 입력하세요");
			String id = scanner.nextLine().trim();
			if(!map.containsKey(id)) {
				System.out.println("존재하지 않는 ID입니다.");
				continue;//재진입
			}else {
				while(true) {
				System.out.println("PW 입력하세요");
				String pw = scanner.nextLine().trim();
				if(map.get(id).equals(pw)) {
					System.out.println("로그인 성공");
					break;//로그인 성공했으므로
				}else {
					System.out.println("로그인 실패");
				}
			}break;//재로그인성공
		}
	}
	
		scanner.close();
		scanner=null;
		
		System.out.println("END");
	
	
	}
}
