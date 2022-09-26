package collectionframwork.exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Lotto {
	private Scanner scan;
	private static int PRICE = 1000;
	private static int LOTTO_RANGE = 45;
	private static int LOTTO_COUNT = 6;
	
	public Lotto() {
		scan = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		new Lotto().run();
	}
	
	
	private void displayMenu() {
		System.out.println("==========================");
		System.out.println("\t Lotto 프로그램");
		System.out.println("--------------------------");
		System.out.println(" 1. Lotto 구입");
		System.out.println(" 2. 프로그램 종료");
		System.out.println("==========================");
	}
	
	private void run() {
		while(true) {
			displayMenu();
			System.out.print("메뉴선택 : ");
			int menu = scan.nextInt();
			switch(menu) {
				case 1:
					buyLotto();
					break;
				case 2:
					System.out.println();
					System.out.println("감사합니다");
					return;
				default:
					System.out.println("잘못된 입력입니다.");
			}
			
		}
	}
	
	private void buyLotto() {
		System.out.println("\nLotto 구입 시작");
		System.out.println();
		System.out.println("(1000원에 로또번호 하나입니다.)");
		System.out.print("금액 입력 : ");
		int amount = scan.nextInt();
		int count = amount / PRICE;
		System.out.println("\n행운의 로또번호는 아래와 같습니다.");
		
		Random random = new Random();
		for(int i=0; i < count; i++) {
			System.out.print("로또번호" + (i+1) + " : ");
			Set<Integer> set = new HashSet<Integer>();
			
			while(set.size() < LOTTO_COUNT) {
				int number = random.nextInt(LOTTO_RANGE) + 1;
				set.add(number);
			}
			
			List<Integer> list = new ArrayList<Integer>(set);
			Collections.sort(list);
			for(int j=0; j<list.size();j++ ) {
				System.out.print(list.get(j));
				if(j < list.size()-1) {
					System.out.print(",");
				}
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("받은 금액은 " + amount +"원이고 거스름돈은 "
				+ amount%PRICE + "원입니다.");
		System.out.println();
	}
}
