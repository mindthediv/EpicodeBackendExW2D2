package com.Epicode.W2D2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
public class Ex2 {
	final static Logger log = LoggerFactory.getLogger(Ex2.class);
	final static void println(String str) {System.out.println(str);}
	final static void printInt(int num) {System.out.println(num);}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init(sc);
		sc.close();
	}
	
	
	
	
	public static void init(Scanner sc) {
		println("Inserire un numero:");
		oddEven(reverseList(randomList(sc)), true);
		println("Inserire un numero:");
		oddEven(reverseList(randomList(sc)), false);
		}
	
	public static List<Integer> randomList(Scanner sc) {
		List<Integer> setRandom = new ArrayList<Integer>();
		try {
			int num = (int) Integer.parseInt(sc.nextLine());
			for(int i = 0; i < num ; i++) {
				setRandom.add((int) Math.floor(Math.random() * 100));
			}
			return setRandom;
		} catch(Exception e){log.error("Errore - "+e);}
		return setRandom;
	}
	
	public static List<Integer> reverseList(List<Integer> list) {
		list.sort(null);
		List<Integer> newList = new ArrayList<Integer>();
		list.forEach(w -> {newList.add(w) ;});
		Collections.reverse(newList);
		list.addAll(newList);
		return list;
	}
	
	public static void oddEven(List<Integer> list, boolean boo) {
		
		list.forEach(i -> {
			System.out.print(i + ", ");
		});
		println("");
		
		if(boo) {
			for(int i = 0 ; i < list.size(); i=i+2) {
				println("posizione "+i+" :"+list.get(i));
			}
		} else {
			for(int i = 1 ; i < list.size(); i=i+2) {
				println("posizione "+i+" :"+list.get(i));
			}
		}
	}
}
