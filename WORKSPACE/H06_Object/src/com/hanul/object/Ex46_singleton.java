package com.hanul.object;

public class Ex46_singleton {
	
	//싱글톤 : 공유영역에 한개만 인스턴스를 생성 
	private static Ex46_singleton instance;
	
	
	private Ex46_singleton( ) {} 
	
	static Ex46_singleton getinstance() {
		if(instance == null) {
			instance = new Ex46_singleton();
		}
		return instance;
	}

}
