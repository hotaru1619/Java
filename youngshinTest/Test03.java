package youngshinTest;

public class Test03 {
	public static void main(String[] args) {

		TV[] tvArr = new TV [3]; // 길이가 3인 TV 객체 배열
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new TV(); //객체 생성
			tvArr[i].channel = i+10;
			//tvArr[i]의 channel에 i+10을 저장
		}
		
		for (int i = 0; i < tvArr.length; i++) {
			tvArr[i].channelUp();
			System.out.printf("tvArr[%d].channel=%d%n",i, tvArr[i].channel);
		}	
	}
}

class TV {
	String color;
	boolean power;
	int channel;
	
	void power() {power = !power;}
//	void channelUp() {++channel;}
	void channelUp() {channel++;}
	void channelDown() {--channel;}

}
