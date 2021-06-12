package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		//==는 주소를 물어보기때문에 false가 나올것이다.
		
		System.out.println(p2 == p3);
		//==는 주소를 물어보기때문에 false가 나올것이다.
		
		System.out.println(p3 == p4);
		//==는 주소를 물어보기때문에 false가 나올것이다.
		
		System.out.println(p4 == p1);
		//==는 주소를 물어보기때문에 true 가 나올것이다.
		
		System.out.println(p1.equals(p2));
		//equals는 객체의 값이 같은지를 물어보는 것이기때문에
		//2 ,3으로 같고 false가 나올것이다.
		//그 이유는 자식클래스에서 equals을 수정하지않고
		//객체의 값만 비교했을때 같더라도
		//정우성이라는 주소와 유재석이라는 주소는 다르기떄문에
		//false가 나오는게맞다.
		
		System.out.println(p4.equals(p1));
		//p1 을 p4에 대입하라 하였으니 결국 객체의 값도
		//같을 것이기때문에 true가 나올것이다.
		
		
		//equals() 메소드가 없는데 실행되는 이유는
		//단군인 OBject에 기본적으로 equals가 있고
		//그것으로 실행되는것이기 때문이다.
	}

}


