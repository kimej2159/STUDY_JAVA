package miniproject;

public class No5_MaxMin {
	public static void main(String[] args) {
		int[] arr = { 100, -70, 25, -13, 320, 80, 255, 42, -100, 72};
		int max = arr[0];
		int min = arr[5];
		
		for(int i =0; i<arr.length; i++) {
			if(arr[i] > max)
			{
				max = arr[i];
			}
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}


}
