import java.util.Scanner;

/**
 * Name:Cameron
 * Teacher:Mr.Hardman
 * Assignment 5, Program # 1
 * Date Last Modified: 11/22/2016
 */

/**
 * @author c.toy
 *
 */
public class IntegerValues {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int userNum =0;
		int[] values = new int[10];
		int numOfNum = 0;
		
		Scanner userInput = new Scanner(System.in);
		
		for(int i = 0; i < values.length; i++){
			System.out.print("Please enter 10 values: ");
			values[i] = userInput.nextInt();
		}
		
		System.out.print("What value do you want to search for? ");
		userNum = userInput.nextInt();
		
		for(int i = 0; i < values.length; i++){
			
		}
			
			int i = 0;
			if(values[i] == userNum){
				numOfNum ++;
		}
		
			System.out.println("The number of times your number has been entered: " + numOfNum);
			userInput.close();
			
	}

}
