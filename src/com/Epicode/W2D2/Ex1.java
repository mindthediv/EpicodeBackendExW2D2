package com.Epicode.W2D2;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Scanner;
import java.util.*;
public class Ex1 {
	final static Logger log = LoggerFactory.getLogger(Ex1.class);
	final static void println(String str) {System.out.println(str);}
	final static void printInt(int num) {System.out.println(num);}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		init(sc);
		sc.close();
	}
	
	public static void init(Scanner sc) {
		println("Inserire un numero:");
		try {
			int num = (int) Integer.parseInt(sc.nextLine());
			Set<String> setDist = new HashSet<String>();
			Set<String> setDup = new HashSet<String>();
			println("parole da inserire: " + num);
			for (int i = 0; i < num ; i++) {
				println("Inserire parola:");
				try {
					String word = sc.nextLine();
					if(setDist.contains(word) && !setDup.contains(word)) {
						setDup.add(word);
					}else if(setDist.contains(word) && setDup.contains(word)) {
					}else {
						setDist.add(word);	
					}
					setDist.forEach(w ->{ if(setDup.contains(w)) {
						setDist.remove(w);
					}
					});
				}
				catch(Exception e) {log.error("Parola non riconosciuta " + e);} 
			}
			println("Parole duplicate: ");
			setDup.forEach(w -> println(w));
			println("Numero parole distinte: ");
			printInt(setDist.size());
			println("Parole distinte: ");
			setDist.forEach(w -> println(w));
		}
		catch(Exception e) {
			log.error("input invalido" + e);
			}
		}
}
	

