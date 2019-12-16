package day05;

public class Test04 {
	public static void main(String[] args) {

		int [] num = {1,2,3,9,8,7,4};
		for(int data :num) { //num collection, only reading
			if(data % 2 != 0) System.out.print(data);
		}
		System.out.println();
		
		char[] c = "ABCD".toCharArray();
		for(char data :c) { //c collection
			System.out.print(data+" ");
		}
		System.out.println();
		
		String[] s = {"hello","java","test"};
		for(String data :s) { // s collection
			if(data.charAt(0) == 't') System.out.print(data);
		}
	}

}
