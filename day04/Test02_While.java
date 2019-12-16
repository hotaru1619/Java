package day04;

public class Test02_While {
	public static void main(String[] args) {
		for(int i=0; i<3; i++) {
			for(int j=0; j<5; j++) {
			System.out.printf("i= %d j=%d", i, j); 
		}
			System.out.println();
		}
		System.out.println("==========================================");
		
//		int i=0;
//		while(i>10) {
//			System.out.println("~~~~~~~");
//			i++;
//		}
//	
	int i=0;
	do{
		System.out.println("~~~~~~~");
		i++;
	}while(i>10);
	
	boolean flag = true;
	while(flag) {
		System.out.println("^^^^^^^^^^^^6");
		int num = (int)(Math.random()*10); //난수, 0보다 크거나 같으면서 1보다 작은 실수 => 0~9
		System.out.println(num);
		if(num%3 == 0) flag = !flag;
	}
	
	}
}
