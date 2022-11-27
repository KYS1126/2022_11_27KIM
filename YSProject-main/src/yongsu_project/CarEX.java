package yongsu_project;

import java.util.ArrayList;
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
			System.out.println("1.차량 선택 | 2.타이어 변경 | 3.색깔 변경 | 4.차량 상태 확인 | 5.종료");
			int selectNo = scanner.nextInt();

			if (selectNo == 1)
				selectcar(); // 차량선택
			else if (selectNo == 2)
				changetire(); // 타이어 변경
			else if (selectNo == 3)
				changecolor(); // 색깔 변경
			else if (selectNo == 4)
				carstate(); // 차량 상태 확인
			else if (selectNo == 5) {
				run = false;
				System.out.println("시스템 종료");
			}

		}
	}

	public static Car carmain = new Car();
	public static Car usercar = carmain;

	// 1.차량선택
	public static void selectcar() {
		System.out.println("================================");
		System.out.println("차량을 선택하세요");
		System.out.println("1.테슬라 | 2.포르쉐");
		System.out.println("================================");
		int selectcar = scanner.nextInt();
		if (selectcar == 1) {
			usercar.TESLA();
		} else if (selectcar == 2) {
			usercar.porsche();
		} else {
			System.out.println("유효하지 않은 선택지 입니다.");
		}
	}

	// 2.타이어 변경
	public static void changetire() {
		System.out.println("================================");
		System.out.println("변경 할 타이어 종류를 선택해 주세요");
		System.out.println("1.사계절용 타이어 | 2.스포츠 타이어 | 3.산악용 타이어");
		System.out.println("================================");
		int changetire = scanner.nextInt();
		if (usercar.speed == 0) {
			System.out.println("차량을 먼저 선택 해 주세요");
		} else if (changetire == 1) {
			usercar.tire = "사계절용 타이어";
		} else if (changetire == 2) {
			usercar.tire = "스포츠 타이어";
		} else if (changetire == 3) {
			usercar.tire = "산악용 타이어";
		}

	}

	// 3.색깔 변경
	public static void changecolor() {
		System.out.println("================================");
		System.out.println("변경 하고싶은 색상을 입력해주세요");
		System.out.println("1.빨강 | 2.검정 | 3.흰색 | 4.초록");
		System.out.println("================================");
		int changecolor = scanner.nextInt();
		if (usercar.speed == 0) {
			System.out.println("차량을 먼저 선택 해 주세요");
		} else if (changecolor == 1) {
			usercar.color = "빨강";
		} else if (changecolor == 2) {
			usercar.color = "검정";
		} else if (changecolor == 3) {
			usercar.color = "흰색";
		} else if (changecolor == 4) {
			usercar.color = "초록";
		}

	}

	// 4.차량 상태 확인
	public static void carstate() {
		if (usercar.speed == 0) {
			System.out.println("차량을 먼저 선택 해 주세요");
		} else {
			System.out.println(usercar.company);
			System.out.println(usercar.model);
			System.out.println(usercar.color);
			System.out.println(usercar.speed);
			System.out.println(usercar.maxSpeed);
			System.out.println(usercar.tire);
		}

	}

}
