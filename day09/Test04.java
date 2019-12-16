package day09;

import javax.swing.JOptionPane;

public class Test04 {
	public static void main(String[] args) {

		Controller cmd = null;
		
		Controller insert = () -> System.out.println("insert 수행");		
		Controller update = () -> System.out.println("update 수행");
		Controller delete = () -> System.out.println("delete 수행");
		//람다 함수
		
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