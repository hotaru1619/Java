package util;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MyUtil {

	public static int[] sort(int[] a) { //a 주소, 원본 보호 필요(int 배열 생성)
		int[] num = a.clone(); // 원본 복제
	
		for(int i=0; i<num.length-1; i++) {
			int min = i;
			for(int j= i+1; j<num.length; j++) { //비교 대상
				if(num[min] > num[j]) {
					min=j;
				}
			}
		if(i!=min) { //num[i] num[min
			MyUtil.swap(num, i, min); //호출, MyUtil 생략 가능
			}
		}
		return num;
		
	}
	
	public static void swap(int[] num, int i, int min) {
		int temp = num[i];
		num[i]=num[min];
		num[min]=temp;

		} 
	
	//두 개의 정수를 입력받아 큰 값을 리턴해주는 max 함수
	public static int max(int a, int b) {
		return a>=b?a:b;
	}
	
	public static int min(int a, int b) {
		return a<b?a:b;
	}
	
	public static void iteratorPrint(Set<String> set) {
		Iterator<String> it = set.iterator();		
		while(it.hasNext()) {
			String data = (String) it.next();
			System.out.println(data + " ");
	} 
}
}