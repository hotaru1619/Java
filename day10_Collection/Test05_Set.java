package day10_Collection;

import java.util.HashSet;
import java.util.Set;
import util.MyUtil;
//import java.util.TreeSet;

public class Test05_Set {
	public static void main(String[] args) {
		
		//Set<String> set = new TreeSet<String>(); //정렬
		Set<String> set = new HashSet<String>();
		set.add("lee");
		set.add("kim");
		set.add("park");
		set.add("ko");
		set.add("lee"); //중복 불가
		
		MyUtil.iteratorPrint(set);
		
//		Iterator<String> it = set.iterator();		
//		while(it.hasNext()) {
//			String data = (String) it.next();
//			System.out.print(data + " "); //data 출력 순서 랜덤
//			//System.out.println(set);
//			
//		}
		
	}

}
