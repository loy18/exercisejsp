package collectionframwork.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class HotelManagement {
	
	private Scanner scan;
	private Map<String,String> roomInfo;
	
	
	public HotelManagement() {
		scan = new Scanner(System.in);
		roomInfo = new HashMap<>();
	}
	
	public static void main(String[] args) {
		new HotelManagement().run();
	}
	
	private void run() {
		System.out.println("**************************");
		System.out.println("호텔 문을 열었습니다.");
		System.out.println("**************************\n");
		while(true) {
			displayMenu();
			System.out.print("메뉴선택 => ");
			String menu = scan.nextLine();
			System.out.println();
			switch(menu) {
				case "1":
					checkIn();
					break;
				case "2":
					checkOut();
					break;
				case "3":
					roomStatus();
					break;
				case "4":
					System.out.println("**************************");
					System.out.println("호텔 문을 닫았습니다.");
					System.out.println("**************************");
					return;
				default:
					System.out.println("없는 메뉴입니다.");
			}
			
		}
	}
	
	private void checkIn() {
		System.out.println("어느방에 체크인 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		String roomNum = scan.nextLine();
		System.out.println();
		System.out.println("누구를 체크인 하시겠습니까?");
		System.out.print("이름 입력 => ");
		String name = scan.nextLine();
		if(roomInfo.get(roomNum) != null) {
			System.out.println(roomNum + "방에는 이미 사람이 있습니다.");
			System.out.println();
			return;
		}
		roomInfo.put(roomNum,name);
		System.out.println("체크인 되었습니다.");
		System.out.println();
	}
	
	private void roomStatus() {
		for(Entry<String,String> entry : roomInfo.entrySet()) {
			System.out.println("방번호 : " + entry.getKey() + ", 투숙객 : "
					+ entry.getValue());
		}
		System.out.println();
	}
	
	private void checkOut() {
		System.out.println("어느방을 체크아웃 하시겠습니까?");
		System.out.print("방번호 입력 => ");
		String roomNum = scan.nextLine();
		if(roomInfo.remove(roomNum) == null) {
			System.out.println(roomNum + "방에는 체크인한 사람이 없습니다.");
			System.out.println();
			return;
		}
		System.out.println("체크아웃 되었습니다.");
		System.out.println();
	}
	
	private void displayMenu() {
		System.out.println("*******************************************");
		System.out.println("어떤 업무를 하시겠습니까?");
		System.out.println("1.체크인\t2.체크아웃\t3.객실상태\t4.업무종료");
		System.out.println("*******************************************");
	}
}
