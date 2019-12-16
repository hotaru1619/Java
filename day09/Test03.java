package day09;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args) {

//		Controller cmd ; //인터페이스 미완성 코드, 완성시킬 주소가 오른쪽에 와야함.
//		Controller cmd = new DeleteController();
		Controller cmd = null;
//		cmd.exec();
		
		Controller insert = new Controller() {
			@Override
			public void exec() {
				System.out.println("insert 수행");
			}	
		};//{메소드 오버라이딩 코드}
		//컨트롤러 인터페이스를 구현한 것(익명)을 메모리에 띄우겠음. 클래스 정의와 생성. 익명 클래스
	
		Controller update = new Controller() {			
			@Override
			public void exec() {
				System.out.println("update 수행");
			}
		};
	
		Controller delete = new Controller() {
			@Override
			public void exec() {
				System.out.println("delete 수행");
			}
		};
		
		String msg 
		= JOptionPane.showInputDialog("명령을 입력하세요. 1. delete 2. insert 3. update ");
		
		switch(msg) {
		case "1" :
		case "delete" :
			cmd = delete;
			break;
		case "2" :
		case "insert" :
			cmd = insert;
			break;
		case "3" :
		case "update" :
			cmd = update;
			break;
		default :
			System.out.println("명령 선택을 다시 하세요.");
			break;
		}
		
		if(cmd != null) cmd.exec();
	}
}

interface Controller{
	void exec();
}

class DeleteController implements Controller{

	@Override
	public void exec() {
		System.out.println("DeleteController 수행");
	}
	
}