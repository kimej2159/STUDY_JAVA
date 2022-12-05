package com.hanul.method;

public class Ex28_method05
{
	public static void main(String[] args)
	{
		// 배열 - 참조-> string
		// 선언 
		// 타입[] 변수명; 타입 변수명[] =>  int[] array;  / int array[];
		// 초기화 
		// array = new int[3]; / 3개 만들면 3,
		// 초기화와 변수 같이 선언 : int[] arrary = new int[3];
		
		String[] arrStr = new String[3];
		
		int[] arr = new int[3];
		int[] arr1 = {85, 90, 75};			// 1. 초기화 방법 하나
		
		arr[0] = 85;						// 2. 초기화 방법 둘
		arr[1] = 90;
		arr[2] = 75;
	
		
		for(int i=0; i<arr.length; i++)		// 1. 출력 방법 하나
		{
			System.out.println(arr[i]);
		}
		
		for(int val : arr)					// 2. 출력 방법 둘
		{
			System.out.println(val);
		}
		
		arrStr[0] = "국어";
		arrStr[1] = "영어";
		arrStr[2] = "수학";
		
		for(int i=0; i<arrStr.length; i++)		// 1. 출력 방법 하나
		{
			System.out.println(arrStr[i]);
		}
		
		for(String str : arrStr)				// 2. 출력 방법 둘
		{
			System.out.println(str);
		}
	
		// 학생들의 성적에 대한 평균과 학점을 출력하는 프로그램을 매소드 선언하여 사용하기 
		int[] parkJumsu = {81, 84, 95};
		int[] simJumsu = {96, 92, 84};
		int[] hongJumsu = {80, 76, 82};
		
		float avg;		// 평균
		char grade;		//학점
		
		
		
		// 성적 평균 구하기 메소드
		avg = averageOfScore(parkJumsu);
		//성적 평균의 학점 구하기 매소드
		grade = gradeofaverage(avg);
		System.out.printf("박점수의 평균은 %.2f 이고 학점은 %c 이다.\n", avg, grade);
		
		avg = averageOfScore(simJumsu);
		grade = gradeofaverage(avg);
		System.out.printf("심청이의 평균은 %.2f 이고 학점은 %c 이다.\n", avg, grade);
		
		avg = averageOfScore(hongJumsu);
		grade = gradeofaverage(avg);
		System.out.printf("홍길동의 평균은 %.2f 이고 학점은 %c 이다.\n", avg, grade);
		
		resultout(parkJumsu, "박점수");
		resultout(simJumsu, "심청이");
		resultout(hongJumsu, "홍길동");
		
	}
		//받은값 : 평균 보낼값 : 학점
		 static char gradeofaverage(float avg)
		 {
			char grade;
			
			if(avg >= 90)
			{	grade = 'A';	}
			
			else if(avg >= 80)
			{	grade = 'B';	}
			
			else if(avg >= 70)
			{	grade = 'C';	}
			
			else if(avg >= 60)
			{	grade = 'D';	}
			
			else
			{	grade = 'F';	}
			
			
			
			return grade;
		 }
		 
		// 각 학생의 점수들, 보내야 할 값 : 평균
		static float averageOfScore(int[] Jumsu)
		 {
			float avg = 0.0f;
			int sum = 0;
			
			for(int i = 0; i < Jumsu.length; i++ )
			{
				sum = sum + Jumsu[i];
			}
			avg = sum/(float)Jumsu.length;
			return avg;
		 }
		
		static void resultout(int[] Jumsu, String name)
		{
			float avg = averageOfScore(Jumsu);
			char grade = gradeofaverage(avg);
			System.out.printf("%d의 평균은 %.2f 이고 학점은 %c 이다.\n", name, avg, grade);
		}
		
		
}
