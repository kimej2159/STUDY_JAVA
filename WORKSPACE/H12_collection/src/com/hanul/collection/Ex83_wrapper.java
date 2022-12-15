package com.hanul.collection;

public class Ex83_wrapper {

	public static void main(String[] args) {
		//기본 데이터 타입(프리미티브타입)의 값을 감싼 형태로 객체를 생성해서
		// 사용하게 만드는 클래스가 있는데 이러한 클래스를 Wrapper 클래스라 한다
		// 피리미티브 타입 : byte, short, int		long	char	float	double	 boolean
		// Wrapper클래스 : Byte, Short, Integer	Long	Char	Float	Double	 Boolean
		
		Byte data1 =((byte)12);			// 밑쪽에서 변수 타입을 변환하니까 new 선언을 안해도 된다
		Integer data2 = (20000);
		Double data3 = (3.14);
		Character data4 = ('봄');
		Boolean data5 =(true);
		
		Byte data6 = new Byte((byte)12);
		Integer data7 = new Integer(20000);
		Double data8 = new Double(3.14);
		Boolean data9 =new Boolean(true);
		
		//데이터 가져와기 Byte타입
		byte data10 = data1.byteValue();
		System.out.println(data10);
		
		int data11 = data7.intValue();
		System.out.println(data11);
		
		//문자열 : 레퍼런스타입, 숫자 : 프리미티브타입 => 형변환 안됨
		// 따라서 숫자를 Wrapper 클래스로 변경하여 사용
		// int a = (int)str1 -> x
		
		String str1 = "123", str2 = "321";
		int no1 = Integer.parseInt(str1);
		int no2 = Integer.parseInt(str2);
			
		System.out.println(str1+str2);
		
		//int -> String 형으로 변환 
		String str3 = String.valueOf(no1);
		String str4 = String.valueOf(no2);
		System.out.println(str3+str4);
		
		
		
		
	}
}
