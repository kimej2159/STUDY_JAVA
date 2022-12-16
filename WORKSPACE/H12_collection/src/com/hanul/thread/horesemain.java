package com.hanul.thread;

public class horesemain {

	public static void main(String[] args) {
		
		horse h1 = new horse("거센질주", 1);
		horse h2 = new horse("다크호스", 2);
		horse h3 = new horse("흥행전사", 3);
		horse h4 = new horse("적토마", 4);
		horse h5 = new horse("날쌘돌이", 5);
		
		// 쓰래드를 상속받았기 때문에 실행시키는 매소드 : start()
		h1.start();
		h2.start();
		h3.start();
		h4.start();
		h5.start();
				
	}
	

}
