import java.util.Scanner;


public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner myNumber = new Scanner(System.in);
		
		double firstNo,secondNo,answer;
		
		System.out.println("Enter first num:");
		firstNo = myNumber.nextDouble();
		
		System.out.println("Enter second num:");
		secondNo = myNumber.nextDouble();
		
		answer = firstNo + secondNo;
		
		System.out.println(answer);

	}

}
