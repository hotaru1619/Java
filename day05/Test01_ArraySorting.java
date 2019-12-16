package day05;

import java.util.Arrays;

public class Test01_ArraySorting {
	public static void main(String[] args) {
		int size=5;
		if(args.length != 0) {
		 size =Integer.parseInt(args[0]);
		} 
		
		int[] num = new int[size];
		for(int i=0; i<num.length; i++) {
			num[i] = (int)(Math.random()*45)+1; //난수 발생(중복 발생 가능성)
			for(int j=0;j<i;j++){
				if(num[j]==num[i]) {
					i--;
					break;  //난수 중복 배제
				}
			}
		}
		System.out.println(Arrays.toString(num)); //위치 이동시키면서 출력(검증)
		
		
		for(int i=0; i<num.length-1; i++) {
			int min = i;
			for(int j= i+1; j<num.length; j++) { //비교 대상
				if(num[min] > num[j]) {
					min=j;
				}
			}
		if(i!=min) {
			int temp = num[i];
			num[i]=num[min];
			num[min]=temp;
		}	
		}
		System.out.println(Arrays.toString(num));
	}

 }
