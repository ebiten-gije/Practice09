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
    		String line = sc.nextLine();
    		String [] strArray = line.split(" ");
    		Friend f = new Friend(strArray[0], strArray[1], strArray[2]);
    		friend.add(f);
    	}
    	
    	Iterator<Friend> friendIterator = friend.iterator();
		
		while (friendIterator.hasNext()) {	//	뒤에 더 있니?
			Friend item = friendIterator.next();
			System.out.println(item);
		}	
    	
		sc.close();
    }

}
