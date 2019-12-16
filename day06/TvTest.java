package day06;

public class TvTest {
	public static void main(String[] args) {
		TV t1 = new TV();
		t1.model="S-tv";
		t1.size=25;
		t1.powerOn();
		t1.setChannel(11);
		t1.channelDown();
		t1.channelDown();
		t1.print();
		
		TV t2 = new TV();
		t2.model = "L-tv";
		t2.size = 32;
		t2.powerOn();
		t2.setChannel(21);
		t2.print();
		
//		t2 = t1; //t2 주소가 t1을 가리킴. 기존 t2가비지 대상, t1 가비지 대상 만들기 위해선 null
//		t2.print();
//		
//		t2=null;
//		t1=null;
		System.out.println("==================");
		new TV().print(); //임시 객체, 생성과 동시에 뭔가 사용하고 버릴 것=>바로 가비지 대상
		System.out.println("==================");
		TV[] tvs = new TV[30];
		tvs[0]=t1;
		tvs[1]=t2;
		t2=null;
		t1=null;
		
		for(int i =0 ;i<tvs.length;i++) {
			//System.out.println(tvs[i]);
			
			if(tvs[i] != null) {
				tvs[i].powerOn();
				tvs[i].print();
			}
			if(tvs[i]==null) break;
		}
	}

}

class TV{
	int size;
	String model;
	int channel;
	boolean power;
	
	public void print() {
		System.out.printf("TV(%s, %d인치, power: %b, channel :%d)%n", model, size, power, channel);
	}//this, heap 영역, 주소 
	//cf. static영역 : MyUtil 등, this 사용 불가, 클래스 명으로 접근
	
	public void powerOn(){
		this.power = true;
	}
	
	public void powerOff(){
		this.power = false;
	}
	
	public void setChannel(int c){
		this.channel = c;
	}
	
	public void channelUp(){
		this.channel++;
	}
	
	public void channelDown(){
		this.channel--;
	}
	
}