package com.hanul.jdbc;


public class Circle {
	
	
		private int radius;
		
		public Circle(int radius) 
		{
			this.radius = radius;
		}

		int getradius( ) {
			return this.radius;
		}

		
		void getradius(int radius) throws Exception{
			if (radius < 0 ) { 
				throw new Exception("생성자 : 길이가 0 보다 커야 됩니다");
			}
			this.radius=radius;
		}
		

		void setradius(int radius) throws Exception{
			if (radius < 0 ) { 
				throw new Exception("생성자 : 길이가 0 보다 커야 됩니다");
			}
			this.radius=radius;
		}
		
		double getarea()
		{
			return 3.14*radius*radius;
		}

		
		
	

}
