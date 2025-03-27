package ch06;
import java.util.ArrayList;

public class Car {
	public int num;
	public boolean is;
	public String str;
	public ArrayList<String> list;
	
	// 생성자가 없으면 컴파일러가 기계어로 변경할때
	// 기본생성자 모양으로 자동으로 추가함.
	
	// 생성자
	/*
	public Car() {
		this.num = 0;
		this.is = false;
		this.str = null;
		this.list = null;
		
	}
	*/
	// 생성자 오버로딩
	// 일반생성자
	public Car(int x) {
		// 컴파일러가 일반생성자가 존재하므로 가본생성자를 추가x
		// 생성자안에 필드초기화 코드가 없다 -> 추가
		this.num = num;
	}
	public Car(boolean is) {
		this.is = is;
	}
	public Car(int num, boolean is) {
		this.num = num;
		this.is = is;
	}
	
	// 메서드 오버로딩
	public void test() {}
	public void test(int x) {}
}

