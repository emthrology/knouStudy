package part11.sec13_Math_Random;

import java.util.Arrays;
import java.util.Random;

public class MathRandom_UtilRandom {

	public static void main(String[] args) {
		int num = (int) (Math.random()*6) +1;
		System.out.println("dice : " +num);
		System.out.println("=============================");
		int[] selectNumber = new int [6];
		Random r = new Random();
		System.out.print("selected :");
		for(int i = 0 ; i<6 ; i++) {
			selectNumber[i] = r.nextInt(45) + 1;
		}
		Arrays.sort(selectNumber);
		System.out.println(Arrays.toString(selectNumber));
		
		int[] winNumber = new int [6];
		 r = new Random();
		System.out.print("winner is : ");
		for(int i = 0 ; i<6 ; i++) {
			winNumber[i] = r.nextInt(45) + 1;
		}
		Arrays.sort(winNumber);
		System.out.println(Arrays.toString(winNumber));
		
		boolean result = Arrays.equals(selectNumber, winNumber);
		if(result) {
			System.out.println("you've got a 1st rottery ticket!!");
		}
		
	}

}
