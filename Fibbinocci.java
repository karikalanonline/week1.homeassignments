package week1.homeAssignment;

public class Fibbinocci {
	public static void main(String[] args) {
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		for (int i=0; i<=11;i++) {
			sum = firstNum + secNum;
			firstNum = secNum;
			secNum = sum;
			System.out.println(sum);
			
			/* for understanding purposes
			 *  sum = 0+1
			 * firstNum = 1
			 * secNum = 1
			 * (1)
			 * 
			 * sum = 1+1
			 * firstNum = 1
			 * secNum = 2
			 * (2)
			 * 
			 * sum = 1+2
			 * firstNum = 2
			 * secNum = 3
			 * (3)
			 * 
			 * sum = 2+3
			 * firstNum = 3
			 * secNum = 5
			 * (5)
			 * 
			 * sum = 3+5
			 * firstNum = 5
			 * secNum = 8
			 * (8)
			 */

		}
	}


}
