package com.javaex.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	System.out.println("친구 3명을 등록해주세용");
    	List <Friend> friend = new ArrayList<>();
    	
    	for(int i = 0; i < 3; i++) {
    		String s = sc.nextLine();
    		String [] str = s.split(" ");
    		Friend f = new Friend(str[0], str[1], str[2]);
    		friend.add(f);
    	}
    	
    	Iterator<Friend> fri = friend.iterator();
		
		while (fri.hasNext()) {	//	뒤에 더 있니?
			Friend item = fri.next();
			System.out.println(item);
		}	
    	
		sc.close();
    }

}
