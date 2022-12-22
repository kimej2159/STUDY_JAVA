package miniproject;

public class No1_compare {
	
	public static void main(String[] args) {
		
		int no1= 10;
		int no2= 5;
		int result;
		
		if (no1 < no2)
		{
			result = no2;
			System.out.println(result);
		}
		else if (no1 > no2)
		{
			result = no1;
			System.out.println(result);
		}
		else 
		{
			System.out.printf("두 수는 같은 수 입니다.\n");
		}
		
	}
}
