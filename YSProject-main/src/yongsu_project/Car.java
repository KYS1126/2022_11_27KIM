package yongsu_project;

public class Car {
	String company ;
	String model ;
	String color ;
	int speed ;
	int maxSpeed ;
	String tire ;
	
	//생성자
	public Car () {
		this.company = "";
		this.model = "";
		this.color = "";
		this.speed = 0;
		this.maxSpeed = 0;
		this.tire = "";
	}

	//메소드
	public void TESLA() {
		this.company = "TESLA";
		this.model = "모델3";
		this.color = "흰색";
		this.speed = 100;
		this.maxSpeed = 150;
		this.tire = "사계절용 타이어";
	}
	
	public void porsche() {
		this.company = "porsche";
		this.model = "타이칸";
		this.color = "검정";
		this.speed = 150;
		this.maxSpeed = 300;
		this.tire = "사계절용 타이어";
	}



}
