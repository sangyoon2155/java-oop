package ch08;
import java.util.Calendar;
import java.util.Calendar.*;
public class Person {
	public String id;
	public String pw;
	public Person() {}
	public Person(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	// 1-1) 리턴타입 : void, 매개변수 : 없음
	public static void m11() {
		System.out.println("hello");
	}
	// 1-6 리턴타입 : void, 매개변수 : class[]
	public void m16b(Data[] datas, int y) {
		for(Data d : datas) {
			if(d.y == y) {
				System.out.println("d.x:"+d.x+", d.y:"+d.y);
			}
		}
	}
	
	public void m16a(Data[] datas) {
		for(int i=0; i<datas.length; i++) {
			if(datas[i].x % 2 == 0) {
				System.out.print(datas[i].y+ ",");
			}
		}
		System.out.println();
	}
	
	
	// 1-5
	public void m15a(Data d) {
		d.y = d.y*100;
	}
	
	// 1-1 과제) 리턴타입 : void, 매개변수 : 없음
	// 12시 이전이면 Good Morning
	// 12 ~ 18시 Good Afternoon
	// ~00시 Good Evening
	public void C() {
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR);
		if(hour<12) {
			System.out.println("Good Morning");
		} else if(hour<18) {
			System.out.println("Good Afternoon");
		} else {
			System.out.println("Good Evening");
		}
	}
	
	// 1-2 리턴타입 : void, 매개변수 : int
	// 매개변수 : int (시간 0 ~ 23)
	public void m12(int time) {
		if(time < 0 || time >23) {
			System.out.println("0~23 입력하세요");
			return;
		} 
		if(time < 12) {
			System.out.println("AM");
		} else {
			System.out.println("PM");
		}
	}
	public void hw12(boolean flag) {
		flag = true;
		System.out.println(flag);
	}
	
	// 1-4 리턴타입 : void, 매개변수 : 배열
	public void m14a(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			arr[i] = i+1;
		}
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+",");
		}
		System.out.println("");
	}
	
	// 1-3 리턴타입 : void, 매개변수 : String
	// 로그인(Person id, pw가 동일하면 로그인)
	public void m13b(String id, String pw) {
		if(this.id.equals(id) && this.pw.equals(pw)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("로그인 실패");
		}
	}
	
	// 글자수 짝/홀
	public void m13a(String name) {
		if(name == null) {
			System.out.println("null 입력 안됩니다.");
			return;
		}
		int len =  name.length();
		if(len % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
	}
}
