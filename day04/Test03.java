package day04;

public class Test03 {
	public static void main(String[] args) {

		A: for(int i=1; i<10; i++) {  //라벨링 작업
			for(int j=2; j<10; j++) {
      			//if(j==5) break; //5단부터 처리 안함.
				//if(j==5) continue; //syso 건너뛰고 재진입, 5단만 빼고 처리
				if(j==5) break A;
				System.out.printf("%2d*%2d=%2d|", j,i, i*j);
			}
		System.out.println();
		}
	}

}
