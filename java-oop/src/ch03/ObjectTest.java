package ch03;

public class ObjectTest {
	
	public static void main(String[] args) {
		Car car;
		car = new Car();
		car.onOff = true;
		car.name = "그랜저";
		car.color = "black";
		
		
		Car car2 = new Car();
		car2.onOff = false;
		car2.name = "K9";
		car2.color = "gray";
		car.move();
	}
}
