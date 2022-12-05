package com.hanul.object;

public class Ex32_car
{
	//필드 : 소유주(String:owner), 차종(String:modelname), 속도(int:speed)
	//메소드 : 출발(void:start()), 멈춤(void:stop()),  
	//가속(void:stepaeccel()) : 속도 40씩 증가, 100이상 시 유지
	//감속(void:stepbreak()) : 속도 30씩 감소, 0이하 시 유지
	
	String owner;
	String modelname;
	int speed;
	
	Ex32_car(String owner, String modelname, int speed)
	{
		this.owner = owner;
		this.modelname = modelname;
		this.speed = speed;
	}
	
	
	
	public Ex32_car(String owner, String modelname)
	{
	//	super();
		this.owner = owner;
		this.modelname = modelname;
	}



	void stepaeccel()
	{
		speed += 40;
		
		if(speed >= 100)
		{
			speed = 100;
		}
		
		
	}
	
	void stepbreak()
	{
		speed -= 30;
		if(speed < 0)
		{
			speed = 0;
		}
		
	}
	
	
	void start()
	{
		System.out.println("시동을 걸었습니다.");
	}
	void stop()
	{
		System.out.println("시동을 껐습니다.");
	}
	
	
}


















