package day10_Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//import javax.swing.JOptionPane;

public class Test04_ArrayList {
	public static void main(String[] args) {

		//List list =new ArrayList();
		List<String> list =new ArrayList<String>();
		//List<String> list =new Vector<String>(); //결과 동일, synchronized, 멀티 스레드 동기화 해결
		System.out.println(list.size());
		list.add("홍길동");
		list.add("김길동");
		list.add("박길동");
		list.add("최길동");
		list.add("홍길동");//중복허용
		
		System.out.println("--------for 순회----------");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("김길동 ?" + list.contains("김길동"));
		System.out.println("고길동 ? " + list.contains("고길동"));
	
		System.out.println("-----------Iterator 기반 순회----------");
		
		// 표준화 된 접근방식, 소모성
		Iterator<String> it = list.iterator();
		while(it.hasNext()) {
			String data = it.next();
			System.out.println(data.charAt(0)+"**");
			System.out.println(data);
		}
			System.out.println("-----------Iterator 기반 삭제----------");
//			String rname = JOptionPane.showInputDialog("삭제할 이름을 입력하세요.");
			it = list.iterator();
			while(it.hasNext()) {
				String data = it.next();
//				if(rname.equals(data)) {
//					it.remove();
//				}
			}						
			System.out.println(list);		
			
			list.add(2,"~~~~~~"); //2번째 위치 확보 후 데이터 넣어주는 작업, 컬렉션 프레임 워크
			System.out.println(list);
	}
}
