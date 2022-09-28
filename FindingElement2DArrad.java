import java.util.Scanner;

public class FindingElement2DArrad {

	public static void main(String[] args) {
		System.out.println("Enter the total size of Row");
		Scanner Scan = new Scanner(System.in);
		int row = Scan.nextInt();
		System.out.println("Enter total size of Column");
		int column = Scan.nextInt();
		int[][] numbers = new int[row][column];

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) { // numbers[i] is 0 index of whole row
				System.out.println("Enter numbers for rows and column");
				int num = Scan.nextInt();
				numbers[i][j] = num;

			}
		}

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.print(numbers[i][j] + " ");

			}
			System.out.println();
		}

		System.out.println("Enter the element to find on Matrix");
		int element = Scan.nextInt();
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] == element) {
					System.out.println("Element found at location " + i + " ," + j);
				}
				else {
					System.out.println("Element not found");
				}
			}

		}
//		int sum = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				sum = sum + numbers[i][j];
//
//			}
//			System.out.println();
//		}
//		System.out.println("The addition of matrix is" + sum);
//
//		System.out.println("Enter a number to multiply Matrix stored at numbers[i][j]");
//		int number = Scan.nextInt();
//		int[][] product = new int[row][column];
//
//		for (int i = 0; i < numbers.length; i++) {
//			for (int j = 0; j < numbers[i].length; j++) {
//				product[i][j] = numbers[i][j] * number;
//				System.out.print(product[i][j] + " ");
//
//			}
//			System.out.println();
//		}
//		for(int i = 0; i < numbers.length; i ++) {
//			for(int j = 0; j < numbers[i].length; j++) {
//				if(product.length != numbers.length) {
//					System.out.println("Addition between two matrix is not possible..Try Again");
//				}
//				else {
//					int sumMatrix = product[i][j] + numbers[i][j];
//					System.out.print(sumMatrix + " ");
//				}
//			}System.out.println();
//		}
//		

	}

}
