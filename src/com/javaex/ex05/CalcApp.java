package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);

    	
    	while(true) {
    		
    		System.out.print(">>");
    		String cal = sc.nextLine();
    		
    		if(cal.equals("/q")) {
    			System.out.println("종료됩니다.");
    			break;
    		}
    		
    		String[] cArray = cal.split(" "); 
    		int a = Integer.parseInt(cArray[0]);
    		int b = Integer.parseInt(cArray[2]);
    		
    		 if(cArray[1].equals("+")) {
    			Add add = new Add();
    			add.setValue(a, b);
    			System.out.println(">>" + add.calculate());

    		} else if(cArray[1].equals("-")) {
    			Sub sub = new Sub();
    			sub.setValue(a, b);
    			System.out.println(">>" + sub.calculate());
    			
    		} else if(cArray[1].equals("/")) {
    			Div div = new Div();
    			div.setValue(a, b);
    			System.out.println(">>" + div.calculate());
    			
    		} else if(cArray[1].equals("*")) {
    			Mul mul = new Mul();
    			mul.setValue(a, b);
    			System.out.println(">>" + mul.calculate());
    			
    		}  else {
    			System.out.println("알 수 없는 연산입니다.");
    		}
    		
    	
    	
    	}
    	

    	
    	
    	
    	sc.close();
    }
}
