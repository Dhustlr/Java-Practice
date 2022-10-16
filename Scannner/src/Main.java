
public class Main {

	public static void main(String[] args) {

		
//		int[] arr = { 10, 20, 30, 40 };
//		int [] arr = new int[5];

		

//		arr[0] = 1;
//		arr[1] = 10;
//		arr[2] = 111;
//		arr[3] = 40;

//		for(int i:arr) {
//			System.out.println(i);
//		}

		Main[] arr = new Main[3];
		
		arr[1] = new Main();
		arr[2] = new Main();
		
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
