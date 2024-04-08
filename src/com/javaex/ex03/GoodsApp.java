package com.javaex.ex03;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("상품을 입력해주세요 (종료: q)");
    	
    	boolean q = true;
    	List <Goods> goods = new ArrayList<>();
    	
    	while(q) {
    		String s = sc.next();
    		if (s.equals("q")) {
    			q = false;
    			System.out.println("[입력완료]");
    			break;
    		}
    		
    		String [] str = s.split(",");
    		int price = Integer.parseInt(str[1]);
    		int count = Integer.parseInt(str[2]);
    		
    		Goods g = new Goods (str[0], price, count);
    		goods.add(g);
    		
    	}
    	
    	System.out.println("================================");
    	
    	int sum = 0;
    	
    	Iterator<Goods> ite = goods.iterator();
		
		while (ite.hasNext()) {	//	뒤에 더 있니?
			Goods g = ite.next();
			sum += g.getCount();
			System.out.println(g);
		}	
    	
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
		sc.close();
    }

}
