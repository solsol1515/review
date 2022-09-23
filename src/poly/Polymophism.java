package poly;

import java.util.Scanner;

public class Polymophism {

	public static void main(String[] args) {
		
		Item i = null;
		
		System.out.println("해당 물품 번호 (1. 책 2.cd 3.dvd");
		Scanner input = new Scanner(System.in);
		int sel = input.nextInt();
		
		switch(sel) {
		case 1: i = new Book("001", "총균쇠", "제러드", "코스모"); break;
		case 2: i = new Cd(); break;
		case 3: i = new Dvd(); break;
		}
		i.output();
		input.close();
	}

}
