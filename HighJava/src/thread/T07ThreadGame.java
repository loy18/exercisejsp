package thread;

import java.util.Random;

import javax.swing.JOptionPane;

/*
	컴퓨터와 가위바위 보를 진행하는 프로그램을 작성하시오.
	
	컴퓨터의 
*/
public class T07ThreadGame {
	public static String player="타임아웃"; 
	
	public static void main(String[] args) {
		InputData2 inputData = new InputData2();
		inputData.start();
		
		for(int i=5; i>0; i--) {
			System.out.println(i);
			try {
				if(inputData.isInputCheck()) {
					break;
				}
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		String[] arr = new String[]{"가위","바위","보"};
		String computer = arr[new Random().nextInt(2)];
		String result;
		if(player.equals(computer)) {
			result = "무승부입니다.";
		} else if((player.equals("가위") && computer.equals("보"))
				||(player.equals("바위") && computer.equals("가위"))
				||(player.equals("보") && computer.equals("바위"))){
			result = "당신이 이겼습니다.";
		} else {
			result = "당신이 졌습니다.";
		}
		
		System.out.println("===결과===");
		System.out.println("컴퓨터 : " + computer);
		System.out.println("당 신 : " + player);
		System.out.println("결 과 : " + result);
		System.exit(0);
	}
}


class InputData2 extends Thread{
	private boolean inputCheck;
	@Override
	public void run() {
		
		T07ThreadGame.player = JOptionPane.showInputDialog("가위,바위,보를 입력하세요");
		inputCheck = true;
		
	}
	public boolean isInputCheck() {
		return inputCheck;
	}
	
}
