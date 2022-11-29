package yongsu_project;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CarEX {
	// 스캐너 객체
	private static Scanner scanner = new Scanner(System.in);
	// 배열 객체
	private static ArrayList<Car> carList = new ArrayList<Car>();

	// 메인 메소드
	public static void main(String[] args) {
		boolean run = true;
		while (run) {
			System.out.println("================================");
			System.out.println("1.차량 선택 | 2.타이어 변경 | 3.색깔 변경 | 4.차량 상태 확인");
			System.out.println("5.상대 자동차 정보 | 6.레이스 | 7.종료");
			int selectNo = scanner.nextInt();

			if (selectNo == 1)
				selectCar(); // 차량선택
			else if (selectNo == 2)
				changeTire(); // 타이어 변경
			else if (selectNo == 3)
				changeColor(); // 색깔 변경
			else if (selectNo == 4)
				carState(); // 차량 상태 확인
			else if (selectNo == 5) {
				enemyCarState(); // 적군 자동차 정보 확인
			} else if (selectNo == 6) {
				recing();
			} else if (selectNo == 7) {				
				run = false;
				System.out.println("시스템 종료");
			} else {
				System.out.println("입력값을 확인하세요");
			}

		}
	}

	public static Car carMain = new Car();
	public static Car userCar = carMain;

	// 1.차량선택
	public static void selectCar() {
		System.out.println("================================");
		System.out.println("차량을 선택하세요");
		System.out.println("1.테슬라 | 2.포르쉐");
		System.out.println("================================");
		int selectcar = scanner.nextInt();
		if (selectcar == 1) {
			userCar.TESLA();
		} else if (selectcar == 2) {
			userCar.porsche();
		} else {
			System.out.println("유효하지 않은 선택지 입니다.");
		}
	}

	// 2.타이어 변경
	public static void changeTire() {
		System.out.println("================================");
		System.out.println("변경 할 타이어 종류를 선택해 주세요");
		System.out.println("1.사계절용 타이어 | 2.스포츠 타이어 | 3.산악용 타이어");
		System.out.println("================================");
		int changetire = scanner.nextInt();
		if (userCar.speed == 0) {
			System.out.println("차량을 먼저 선택해 주세요");
		} else if (changetire == 1) {
			userCar.tire = "사계절용 타이어";
		} else if (changetire == 2) {
			userCar.tire = "스포츠 타이어";
		} else if (changetire == 3) {
			userCar.tire = "산악용 타이어";
		}

	}

	// 3.색깔 변경
	public static void changeColor() {
		System.out.println("================================");
		System.out.println("변경 하고싶은 색상을 입력해주세요");
		System.out.println("1.빨강 | 2.검정 | 3.흰색 | 4.초록");
		System.out.println("================================");
		int changecolor = scanner.nextInt();
		if (userCar.speed == 0) {
			System.out.println("차량을 먼저 선택해 주세요");
		} else if (changecolor == 1) {
			userCar.color = "빨강";
		} else if (changecolor == 2) {
			userCar.color = "검정";
		} else if (changecolor == 3) {
			userCar.color = "흰색";
		} else if (changecolor == 4) {
			userCar.color = "초록";
		}

	}

	// 4.차량 상태 확인
	public static void carState() {
		if (userCar.speed == 0) {
			System.out.println("차량을 먼저 선택해 주세요");
		} else {
			System.out.println("제조사:" + userCar.company);
			System.out.println("차량이름:" + userCar.model);
			System.out.println("색상:" + userCar.color);
			System.out.println("평균속력:" + userCar.speed);
			System.out.println("최고속력:" + userCar.maxSpeed);
			System.out.println("타이어 종류:" + userCar.tire);
		}

	}

	// 5.enemyCar 상태 확인
	static Car enemyCar = new enemyCar();

	public static void enemyCarState() {
		if (userCar.speed == 0) {
			System.out.println("사용자 차량을 먼저 선택해 주세요");
		} else {
			System.out.println("=====상대 자동차 정보 =====");
			System.out.println("제조사:" + enemyCar.company);
			System.out.println("차량이름:" + enemyCar.model);
			System.out.println("색상:" + enemyCar.color);
			System.out.println("평균속력:" + enemyCar.speed);
			System.out.println("최고속력:" + enemyCar.maxSpeed);
			System.out.println("타이어 종류:" + enemyCar.tire);
		}
	}
	
	
	public static void recing () {
		Random random = new Random();
		//===================================최대값
		int userCarMaxSpeed = userCar.maxSpeed; //사용자 최대값
		int enemyCarMaxSpeed = enemyCar.maxSpeed; //상대 최대값
		//===================================최소값
		int userCarMinSpeed = userCar.speed; //사용자 최소값
		int enemyCarMinSpeed = enemyCar.speed; //상대 최소값
		
		//사용자 랜덤난수 150~300
		int userRandom1 = (int) (Math.random()* (userCarMaxSpeed - userCarMinSpeed)) + userCarMinSpeed;
		int userRandom2 = (int) (Math.random()* (userCarMaxSpeed - userCarMinSpeed)) + userCarMinSpeed;
		int userRandom3 = (int) (Math.random()* (userCarMaxSpeed - userCarMinSpeed)) + userCarMinSpeed;
		//상대 랜덤 난수 100~150
		int enemyRandom1 = (int) (Math.random()* (enemyCarMaxSpeed - enemyCarMinSpeed)) + enemyCarMinSpeed;
		int enemyRandom2 = (int) (Math.random()* (enemyCarMaxSpeed - enemyCarMinSpeed)) + enemyCarMinSpeed;
		int enemyRandom3 = (int) (Math.random()* (enemyCarMaxSpeed - enemyCarMinSpeed)) + enemyCarMinSpeed;
		
		
		
		System.out.println("진행하려면 1번을 누르세요");
		int chapter1 = scanner.nextInt();
		System.out.println("유저 현재 속도:" + userRandom1);	
		System.out.println("상대 현재 속도:" + enemyRandom1);
		
		System.out.println("진행하려면 1번을 누르세요");
		int chapter2 = scanner.nextInt();
		System.out.println("유저 현재 속도:" + userRandom2);	
		System.out.println("상대 현재 속도:" + enemyRandom2);
			
		System.out.println("진행하려면 1번을 누르세요");
		int chapter3 = scanner.nextInt();
		System.out.println("유저 현재 속도:" + userRandom3);	
		System.out.println("상대 현재 속도:" + enemyRandom3);
			
		int userTotal = userRandom1+userRandom2+userRandom3;
		int enemyTotal = enemyRandom1+enemyRandom2+enemyRandom3;
		
		if (userTotal > enemyTotal) {
			System.out.println("승리하였습니다.");
			System.out.println("유저 평균속도: " + userTotal / 3);			
			System.out.println("상대 평균속도: " + enemyTotal / 3);			
		} else if (userTotal < enemyTotal) {
			System.out.println("패배하였습니다.");
			System.out.println("유저 평균속도: " + userTotal / 3);			
			System.out.println("상대 평균속도: " + enemyTotal / 3);			
		} else {
			System.out.println("무승부입니다.");			
			System.out.println("유저 평균속도: " + userTotal / 3);			
			System.out.println("상대 평균속도: " + enemyTotal / 3);			
		}
		
		
		
		
		
	}

}
