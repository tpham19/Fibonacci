import java.util.Scanner;

/**
 * This program prints the Fibonacci sequence to a given number.
 * 
 */
public class Fibonacci {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 = 1;
		int num2 = 1;
		int nextNum;
		int givenNum;
		System.out.print("Enter a number greater than zero: ");
		givenNum = input.nextInt();
		System.out.println("Here is the Fibonacci Sequence up to " + givenNum);
		System.out.print(num1);
		while (num2 < givenNum) {
			nextNum = num1 + num2;
			num1 = num2;
			num2 = nextNum;
			System.out.print(", " + num1);
		}
		System.out.println();
	}
}
