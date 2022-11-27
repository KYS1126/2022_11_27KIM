package yongsu_project;

import java.util.ArrayList;
import java.util.Scanner;

public class CarEX {
	//스캐너 객체
	private static Scanner scanner = new Scanner(System.in);
	//배열 객체
	private static ArrayList<Car> carList = new ArrayList<Car>();
	
	
	//메인 메소드
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("1.차량 만들기 | 2.타이어 변경 | 3.색깔 변경 | 4.차량 상태 확인 | 5.종료");
		
			int selectNo = scanner.nextInt();
			
			if(selectNo == 1) selectCar();
			else if (selectNo == 2) tire();
			else if (selectNo == 3) color();
			else if (selectNo == 4) 
			else if (selectNo == 5) run = false;
			
		}
		
		
	}
	
	//1.차량선택
	public static void selectCar() {
		
	}
	//2.타이어 변경
	
	//3.색깔 변경
	
	//4.차량 상태 확인
	
	
	

}
