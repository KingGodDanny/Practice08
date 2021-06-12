package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p = new Point(3, 3);
		
		System.out.println(p.toString());

		//Point.java에 toString이 없고 App에서 toString을 출력하라한다면
		//extends 되어있진 않지만 Object인 단군의 toString의 값이 출력이 
		//되는것이다. 
		
		
	}

}


