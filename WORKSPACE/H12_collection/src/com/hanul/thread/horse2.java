package com.hanul.thread;

public class horse2 implements Runnable {
	
	//경주마 5마리가 달리기를 하는 멀티쓰레드 프로그램을 작성한다 -thread 패키지
	//1.Thread 클래스를 상속받아 horse 클래스를 선언하고 horse객체를 멀티쓰레드로 실행시킨다
	//2.경주마가 달리면서 20미터 간격으로 현재 달리고 있는 지점과 이름을 출력한다. 
	//	실제 달리면 20미터 통과지점마다 시간 차이가 있지만 프로그램 상에서는 
	//	거의 시간 차 없이 출력되므로 시간을 1초 정도 간격으로 sleep(1000)하도록 한다
	//3.도착지점 (100미터지점)에서 어떤 말이몇 등으로 도착했는지의 순위를 출력한다. 
	//4.static int rank; 순위 필드
	
	String name;		//말 이름 변수
	int no;				//말 번호 변수
	static int rank;	//순위 변수
	
	public horse2(String name, int no) 
	{
		this.name = name;
		this.no = no;
	}
	
	// Runnable의 run() 매소드를 오버라이드 시켜 구현한다 
	public void run() {
		for(int m=0; m<=100; m+=20) {
			if(m==0) {
				System.out.printf("%d번 경주마 [%s] 막 출발!!\n", no, name);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(m<100) {
				System.out.printf("[%s]경주마 현재 %d미터 지점통과 %d 막 출발!!\n", name, m, no);
			}
			if(m>=100) {
				++rank;
				System.out.printf("%d번 [%s] 경주마 %d위로 결승점 통과!!\n", no, name, rank);
			}
		}
		
		
	}
	
	

}
