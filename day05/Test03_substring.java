package day05;

import java.util.Arrays;

public class Test03_substring {
	public static void main(String[] args) {

		//System.out.println(args.length); //0 비어있는 배열
		//System.out.println(Arrays.toString(args)); //[]....도스창 실행
		
		//run configurations>arguments>program arguments=>run
		
//		if(args.length == 0) {
//		System.out.println("파라미터 넘겨주세요~~");
//		return;
//		}
//		System.out.println(args[0].charAt(0)+"**");
		
		int[] num 	= new int[] {9,7,1,2,3};  
		int[] num2= num; // 9 7 99 2 3
		int[] num3= num.clone(); // 9 7 1 2 3
		
		num2[2]=99; //call by reference
		Arrays.sort(num3); // 1 2 3 7 9
		
		System.out.println(Arrays.toString(num));
		System.out.println(Arrays.toString(num2));
		System.out.println(Arrays.toString(num3));
		
		String url = "http://myweb/admin/login.do";
		 			//01234567891011
//		System.out.println(url.substring(13,18)); //admin
//		System.out.println(url.substring(19,24)); //login
//		System.out.println(url.substring(0,4)); //http
		
		System.out.println(url.indexOf('/'));
		System.out.println(url.substring(url.lastIndexOf('/')));
		String r = url.substring(10);
		System.out.println(url);
		System.out.println(r);
		
		
	}

}
