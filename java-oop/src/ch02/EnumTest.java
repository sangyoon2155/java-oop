package ch02;

public class EnumTest {
	public static void main(String[] args) {
			char gender = 'ㅁ';  // m,f 가 아닌 다른값이 대입될수 있다.
			
			if(gender == 'M') {
				System.out.println("남자");
			} else if(gender == 'F') {
				System.out.println("여자");
			} else {
				System.out.println("잘못된 값입니다.");
			}
			
			Gender gender2 = null;
			gender2 = Gender.MALE;
			
			if(gender2 == Gender.MALE) {
				System.out.println("남자");
			} else {
				System.out.println("여자");
			}
	
			switch(gender2) {
			case Gender.MALE:
				System.out.println("남자");
			case Gender.FEMALE:
				System.out.println("여자");
				break;
			}
			
	}
}