package ch08;

import java.util.Calendar;

public class PersonMain {
	
	public static void main(String[] args) {
		Person p1 = new Person("admin", "1234");
		// p1.id:admin, p1.pw:1234
		
		// 1-3
		p1.m13b("guest","1234");
		p1.m13b("admin","1234");
		
		// 1-4
		int[] arr = new int[5]; // 0, 0, 0, 0, 0
		p1.m14a(arr);
		
		// 1-5
		Data d = new Data(7,7);
		p1.m15a(d);
		System.out.println(d.x);
		System.out.println(d.y);
		
		// 1-6
		Data[] datas = new Data[4];
		datas[0] = new Data(13, 100);
		datas[1] = new Data(23, 200);
		datas[2] = new Data(20, 300);
		datas[3] = new Data(39, 400);
		p1.m16a(datas);
		p1.m16b(datas, 300);
		
		p1.m11();
		p1.m12(9);
		p1.C();
		
		Calendar c = Calendar.getInstance();
		int h = c.get(Calendar.HOUR);
		p1.m12(h);
		p1.hw12(false);
		// 매개변수로 값이 전달
		boolean x = false;
		p1.hw12(x);
		System.out.println(x);
		
		p1.m11();
		
	}
}
