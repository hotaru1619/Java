package submit;

public class StackTest {
	public static void main(String[] args) {
		
		MyStack stack = new MyStack(-10); //음수 입력 => error => code 변경
		
		if(stack.isEmpty()){
			System.out.println("스택이 비어있습니다.");
		}
		
		for (int i = 1; i <= 20; i++) {
			stack.push(i); //20적용해보기도 하고 resizing 후 
		}
		
		if(stack.isFull()){
			System.out.println("스택이 가득 찼습니다.");
		}
		
		System.out.println("최상위 숫자 : " + stack.top());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("최상위에서 꺼낸 숫자 : " + stack.pop());
		System.out.println("");
		System.out.println("== 스택 리스트 ==");
		for (int i = 1; i <= 10; i++) {
			int num = stack.pop();
			if(num != -1)
				System.out.println(num);
		}
	}
}

class MyStack{
	private int[] stack =null;
	int cnt = 0; //카운터변수, 실제 데이터가 몇 개인지
//	1.	MyStack클래스는 기본생성자로 생성하면 int 타입의 정수를 10개만 저장하는 Stack 클래스이다. 
//  int 타입의 배열 관리, size에 대해 언급하지 않으면 정수 10개
//	2.	객체 생성 시 생성자 매개변수로 배열의 크기를 지정할 수 있으나 
// 음수가 매개변수로 들어올 경우는 기본적으로 10개의 정수를 저장하도록 한다. 
// 8. java.util.Stack class는 사용하지 않는다 =>API 사용하지 말고 만들어보기
	//stack구조 Last In First Out
	MyStack(){
		stack = new int[10];
	}//기본생성자

	MyStack(int size){
		if(size<0) {
		size = 10;
			//stack = new int[10];		
		}
		stack = new int[size];
	}
	//parameter 1개인 생성자 
	
	//3. push() 메서드로 Stack에 정수를 저장한다.
	// stack int 저장 cnt++
	public void push(int i) {
		//if(isFull()) return; //있고 없음에 따라 10일 때 20일 때 다름.
		if(isFull()) {
			int[] temp = new int [stack.length*2];
			System.arraycopy(stack, 0, temp, 0, stack.length);
		stack = temp;
		temp = null;
		}//resizing
		stack[cnt] = i;
		cnt++;
	}

	//cnt가 0인지 아닌지
	public boolean isEmpty() {
		return cnt == 0?true:false;
	}
	
	//cnt가 10이면 full 10일 때 +되면 예외발생, 배열의 경계선 체크
	public boolean isFull() {
		return cnt == stack.length?true:false;
	}
		
	
	public int top() {
		if(isEmpty()) return -1; //-1 리턴의 의미 : 데이터가 없음.
		return stack[cnt-1];
	}
		
	//top() 메서드로 Stack에서 최상위에 저장된 숫자가 뭔지 알 수 있다. 
	//top() 메서드를 호출했다고 해서 숫자가 삭제되는 것은 아니다. 
	//꺼낼 숫자가 없는 경우 -1을 리턴한다.
	
	
	//cnt-- , cnt가 음수가 되면 예외 발생, 배열의 경계선 체크
	
	//엿보기 작업, 맨 위에 어떤 데이타가 있는지~
	//stack에서 cnt-1에 어떤 데이타 있는지
	public int pop() {
		if(isEmpty()) return -1;
		return stack[--cnt];//cnt-1위치의 데이터, cnt 변화 없음.
		//반면, --cnt는 cnt가 1감소
	}
	//pop() 메서드로 Stack에서 최상위에 저장된 숫자를 꺼낼 수 있다. 
	//스택에서 숫자를 꺼내면 그 숫자는 Stack에서 삭제된다. 
	//꺼낼 숫자가 없는 경우 -1을 리턴한다.

}

